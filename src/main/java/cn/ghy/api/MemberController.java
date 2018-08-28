package cn.ghy.api;

import cn.ghy.model.Member;
import cn.ghy.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
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

  @Autowired
  private MemberService memberService;

  @RequestMapping(value = "/{uid}", method = RequestMethod.GET)
  public Member getMember(@PathVariable("uid") int uid) {
    return memberService.selectByPrimaryKey(uid);
  }
}
