package cn.ghy.controller;


import cn.ghy.base.Response;
import cn.ghy.entity.User;
import cn.ghy.service.UserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户 前端控制器
 * </p>
 *
 * @author Ziyang
 * @since 2018-09-02
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/")
  public Response index() {
    return new Response();
  }

}

