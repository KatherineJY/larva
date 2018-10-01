package cn.ghy.utils;

import java.io.File;

/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/10/1 23:00
 * @Description:
 */
public class FileUtils {

  public String getFileShortName(String fileName) {
    /**
     * @description: 获取文件名
     * @param: [fileName]
     * @return: java.lang.String
     */
    if (fileName != null && fileName.length() > 0 && fileName.lastIndexOf(".") > -1) {
      return fileName.substring(0, fileName.lastIndexOf("."));
    }
    return fileName;
  }

  public String getFileSuffix(String fileName) {
    /**
     * @description: 获取文件后缀
     * @param: [fileName]
     * @return: java.lang.String
     */
    if (fileName != null && fileName.length() > 0 && fileName.lastIndexOf(".") > -1) {
      return fileName.substring(fileName.lastIndexOf("."));
    }
    return "";
  }

  public void createDirectory(String directory) {
    /**
     * @description: 创建目录
     * @param: [dirPath]
     * @return: cn.ghy.entity.Response
     */
    File dir = new File(directory);
    if (!dir.exists()) {
      dir.mkdirs();
    }
  }
}
