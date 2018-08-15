package cn.ghy.controller;

import cn.ghy.model.Resume;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.*;

@Controller
@RequestMapping(value = "/resume")
public class ResumeController {
    @RequestMapping(value = "/")
    public String index() {
        return "/resume/index";
    }

    @RequestMapping(value = "/postResume", method = RequestMethod.POST)
    public String postResume(@ModelAttribute Resume resume) throws IOException {
        resume.write2EXCEL("D:/resumes_2018.xlsx");
        return "/resume/successful";
    }


}