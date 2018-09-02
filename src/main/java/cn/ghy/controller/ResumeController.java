package cn.ghy.controller;

import cn.ghy.entity.Resume;
import cn.ghy.base.Response;
import org.springframework.web.bind.annotation.*;

import java.io.*;

/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/8/26 23:38
 * @Description:
 */
@RequestMapping(value = "/api/resume")
@RestController
public class ResumeController {

  @RequestMapping(value = "", method = RequestMethod.POST)
  public Response index(@ModelAttribute Resume resume) throws IOException {
    resume.write2EXCEL("D:/resumes_2018.xlsx");
    return new Response();
  }
}