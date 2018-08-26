package cn.ghy.api;

import cn.ghy.model.Member;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/8/27 00:33
 * @Description:
 */
@RestController
@RequestMapping("/api/member")
public class MemberController {

  @RequestMapping(value = "/{uid}", method = RequestMethod.GET)
  public Member getMember(@PathVariable("id") int id){

  }
}
