package cn.ghy.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;


/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/8/28 21:00
 * @Description: Spring Security 配置文件
 */
@EnableWebSecurity
public class SecurityConfig {

  @Autowired
  public void configureGlobal(
      AuthenticationManagerBuilder auth) throws Exception {
    auth
        .inMemoryAuthentication()
        .withUser(User.withDefaultPasswordEncoder().username("user").password("password").roles("USER"));
  }
}