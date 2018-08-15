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
