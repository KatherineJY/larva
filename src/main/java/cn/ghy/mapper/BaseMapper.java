package cn.ghy.mapper;

import java.util.List;

/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/8/27 19:13
 * @Description:
 */
public interface BaseMapper<T> {

  int deleteByPrimaryKey(Integer id);

  int insert(T record);

  T selectByPrimaryKey(Integer id);

  List<T> selectAll();

  int updateByPrimaryKey(T record);
}
