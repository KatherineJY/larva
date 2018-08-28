package cn.ghy.service.impl;

import cn.ghy.mapper.BaseMapper;
import cn.ghy.service.BaseService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/8/27 22:30
 * @Description:
 */

public class BaseServiceImpl<T> implements BaseService<T> {

  @Autowired
  private BaseMapper<T> baseMapper;

  @Override
  public int deleteByPrimaryKey(Integer id) {
    return baseMapper.deleteByPrimaryKey(id);
  }

  @Override
  public int insert(T record) {
    return baseMapper.insert(record);
  }

  @Override
  public T selectByPrimaryKey(Integer id) {
    return baseMapper.selectByPrimaryKey(id);
  }

  @Override
  public List<T> selectAll() {
    return baseMapper.selectAll();
  }

  @Override
  public int updateByPrimaryKey(T record) {
    return baseMapper.updateByPrimaryKey(record);
  }
}
