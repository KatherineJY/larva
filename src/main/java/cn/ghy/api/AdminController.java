package cn.ghy.api;

import cn.ghy.response.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/8/27 00:41
 * @Description:
 */
@RestController
@RequestMapping("/api/admin")
public class AdminController {
  @RequestMapping("/login")
  public Response login(){
    return new Response();
  }
}
