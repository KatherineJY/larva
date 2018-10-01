package cn.ghy.controller;

import cn.ghy.entity.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/10/1 18:21
 * @Description: 登陆控制器
 */
@RestController
@RequestMapping(value = "/login")
public class LoginController {

  @RequestMapping(value = "", method = RequestMethod.POST)
  public Response login() {
    return new Response();
  }
}
