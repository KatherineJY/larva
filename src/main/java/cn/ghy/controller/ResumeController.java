package cn.ghy.controller;

import cn.ghy.entity.Resume;
import cn.ghy.entity.Response;
import org.springframework.web.bind.annotation.*;

import java.io.*;

/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/8/26 23:38
 * @Description:
 */
@RequestMapping(value = "/resume")
@RestController
public class ResumeController {

  @RequestMapping(value = "", method = RequestMethod.POST)
  public Response index(@RequestBody Resume resume) throws IOException {
    resume.write2Excel("D:/resumes_2018.xlsx");
    return new Response();
  }
}