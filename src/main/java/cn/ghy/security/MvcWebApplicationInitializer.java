package cn.ghy.security;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/9/2 00:44
 * @Description:
 */
public class MvcWebApplicationInitializer extends
    AbstractAnnotationConfigDispatcherServletInitializer {

  //Specify @Configuration and/or @Component classes to be provided to the root application context.
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class[]{SecurityConfig.class};
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class[0];
  }

  @Override
  protected String[] getServletMappings() {
    return new String[0];
  }

  // ... other overrides ...
}