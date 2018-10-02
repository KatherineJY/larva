package cn.ghy.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/10/2 22:22
 * @Description:
 */
public class UrlUtils {

  public String decodeUrl(String encodedUrl) throws UnsupportedEncodingException {
    return URLDecoder.decode(encodedUrl, StandardCharsets.UTF_8);
  }
}
