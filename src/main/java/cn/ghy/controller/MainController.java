/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/8/26 23:38
 * @Description:
 */
package cn.ghy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/")
public class MainController {

  @RequestMapping(value = "/")
  public String index() {
    return "/index";
  }
}
