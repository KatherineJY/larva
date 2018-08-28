package cn.ghy.service;

import java.util.List;

/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/8/27 22:24
 * @Description:
 */
public interface BaseService<T> {

  int deleteByPrimaryKey(Integer id);

  int insert(T record);

  T selectByPrimaryKey(Integer id);

  List<T> selectAll();

  int updateByPrimaryKey(T record);
}
