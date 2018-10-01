package cn.ghy.service;

import cn.ghy.entity.User;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
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
public class UserServiceTest {

  @Autowired
  private UserService userService;

  @Test
  public void insert() {
    User user = new User();
    user.setUserName("SignorinoY");
    user.setEmail("meetziyang@q1123.com");
    user.setRealName("龚梓阳");
    user.setPassword("123456");
    //user.setAvatar("none");
    System.out.println(userService.insert(user));
  }

  @Test
  public void selectById() {
    User user = userService.selectById(7);
    System.out.println(user.toString());
  }
  @Test
  public void selectByEmail() {
    String s = "meetziyang@qq.com";
    EntityWrapper<User> entityWrapper = new EntityWrapper<>();
    entityWrapper.eq("email",s);
    User user = userService.selectOne(entityWrapper);
    System.out.println(user.toString());
  }
}