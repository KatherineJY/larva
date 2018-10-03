package cn.ghy.controller;

import cn.ghy.entity.Response;
import cn.ghy.entity.User;
import cn.ghy.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/10/2 17:54
 * @Description: 注册控制器
 */
@RestController
@RequestMapping("/register")
public class RegisterController {

  private final UserService userService;

  @Autowired
  public RegisterController(UserService userService) {
    this.userService = userService;
  }

  @RequestMapping(value = "", method = RequestMethod.POST)
  public Response register(@RequestBody @Valid User user, BindingResult result) {
    Response response;
    if (result.hasErrors()) {
      response = new Response(400, "Illegal input.", result.toString());
    } else {
      if (isEmailAvailable(user.getEmail())) {
        try {
          String rawPassword = user.getPassword();
          String encodedPassword = "{bcrypt}" + new BCryptPasswordEncoder().encode(rawPassword);
          user.setPassword(encodedPassword);
          System.out.println(encodedPassword);
          System.out.println(userService.save(user));
          response = new Response(201, "User has been successfully created.");
        } catch (Exception e) {
          response = new Response(400, "Failed to create user.");
        }
      } else {
        response = new Response(400, "The Email has been registered.");
      }
    }
    return response;
  }

  @RequestMapping(value = "/email", method = RequestMethod.POST)
  public Response emailAvailable(@RequestParam String email) {
    return new Response(200, "Successful.", isEmailAvailable(email));
  }

  public boolean isEmailAvailable(String email) {
    return userService.count(new QueryWrapper<User>().eq("email", email)) == 0;
  }
}
