package cn.ghy.controller;

import cn.ghy.entity.Response;
import cn.ghy.entity.Resume;
import cn.ghy.utils.FileUtils;
import java.io.IOException;
import java.util.Calendar;
import javax.validation.Valid;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/8/26 23:38
 * @Description: 简历控制器
 */
@ControllerAdvice
@RestController
@RequestMapping(value = "/resume")
public class ResumeController {

  private String basePath = new FileUtils().root + "resumes/ghy/";

  @ExceptionHandler
  public void handleException(HttpMessageNotReadableException exception) {
    System.out.println(exception.toString());
  }

  @RequestMapping(value = "/ghy", method = RequestMethod.POST)
  public Response insert(@Valid @RequestBody Resume resume, BindingResult result)
      throws IOException {
    if (result.hasErrors()) {
      return new Response(400, "Illegal input.");
    } else {
      String path = getResumePath();
      resume.write2Excel(path);
      return new Response(201, "Successfully submit your resume.");
    }
  }

  private String getResumePath() {
    String resumePath = basePath;
    Calendar cal = Calendar.getInstance();
    int month = cal.get(Calendar.MONTH) + 1;
    int year = cal.get(Calendar.YEAR);
    if (month <= 6) {
      resumePath = resumePath + year + "_spring" + ".xlsx";
    } else {
      resumePath = resumePath + year + "_fall" + ".xlsx";
    }
    return resumePath;
  }
}