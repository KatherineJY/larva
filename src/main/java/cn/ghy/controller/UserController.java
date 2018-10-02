package cn.ghy.controller;


import cn.ghy.entity.Response;
import cn.ghy.entity.User;
import cn.ghy.service.UserService;
import cn.ghy.utils.PageUtils;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/10/1 18:20
 * @Description: 用户控制器
 */
@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/{uid}", method = RequestMethod.GET)
  public Response selectById(@PathVariable int uid) {
    User user = userService.selectById(uid);
    if (user != null) {
      return new Response(200, "Successful.", user);
    } else {
      return new Response(404, "User not found.");
    }
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public Response selectAll(@RequestParam(value = "page", defaultValue = "1") int page,
      @RequestParam(value = "per_page", defaultValue = "20") int perPage,
      @RequestParam(value = "user_name", defaultValue = "") String userName,
      @RequestParam(value = "real_name", defaultValue = "") String realName,
      @RequestParam(value = "email", defaultValue = "") String email,
      @RequestParam(value = "sortby", defaultValue = "uid") String column,
      @RequestParam(value = "order", defaultValue = "asc") String order) {
    Page<User> userPage = userService
        .selectPage(new Page<User>(page, perPage),
            new EntityWrapper<User>().eq("is_deleted", 0).like("user_name", userName)
                .like("real_name", realName).like("email", email)
                .orderBy(column, new PageUtils().isAsc(order))
        );
    if (userPage.getSize() > 0) {
      return new Response(200, "Successful.", userPage);
    } else {
      return new Response(404, "User not found.");
    }
  }

  @RequestMapping(value = "", method = RequestMethod.POST)
  public Response insert(@RequestBody @Valid User user, BindingResult result) {
    if (result.hasErrors()) {
      return new Response(400, "Illegal input.");
    }
    if (userService.insert(user)) {
      return new Response(201, "User has been successfully created.");
    } else {
      return new Response(400, "Failed to create user.");
    }
  }

  @RequestMapping(value = "", method = RequestMethod.PUT)
  public Response updateById(@RequestBody @Valid User user, BindingResult result) {
    if (result.hasErrors()) {
      return new Response(400, "Illegal input.");
    }
    if (userService.selectCount(new EntityWrapper<User>().eq("uid", user.getUid())) > 0) {
      userService.update(user, new EntityWrapper<User>().eq("uid", user.getUid()));
      return new Response(201, "User has been successfully updated.");
    } else {
      return new Response(400, "User does not exist and cannot be updated.");
    }
  }

  @RequestMapping(value = "/{uid}", method = RequestMethod.DELETE)
  public Response deleteById(@PathVariable int uid) {
    if (userService.selectCount(new EntityWrapper<User>().eq("uid", uid)) > 0) {
      userService.deleteById(uid);
      return new Response(204, "The user has been successfully deleted");
    } else {
      return new Response(400, "User does not exist and cannot be deleted.");
    }
  }
}