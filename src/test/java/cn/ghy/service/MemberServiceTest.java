package cn.ghy.service;

import cn.ghy.model.Member;
import cn.ghy.service.MemberService;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/8/27 23:55
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class MemberServiceTest {

  @Autowired
  private MemberService memberService;

  @Test
  public void deleteByPrimaryKey() {
    System.out.println(memberService.deleteByPrimaryKey(1));
  }

  @Test
  public void insert() {
    Member member = new Member();
    member.setUserName("SignorinoY");
    member.setEmail("meetziyang@gmail.com");
    member.setRealName("龚梓阳");
    member.setPassword("123456");
    member.setAvatar("none");
    System.out.println(memberService.insert(member));
  }

  @Test
  public void selectByPrimaryKey() {
    Member member = memberService.selectByPrimaryKey(2);
    System.out.println(member.toString());
  }

  @Test
  public void selectAll() {
    List<Member> members = memberService.selectAll();
    for (Member member : members) {
      System.out.println(member.toString());
    }
  }

  @Test
  public void updateByPrimaryKey() {
    Member member = new Member();
    member.setUid(2);
    member.setUserName("SignorinoY");
    member.setEmail("meetziyang@gmail.com");
    member.setRealName("龚梓阳");
    member.setPassword("654321");
    member.setAvatar("none");
    System.out.println(memberService.updateByPrimaryKey(member));
  }

}