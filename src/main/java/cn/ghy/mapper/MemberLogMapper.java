/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/8/26 23:38
 * @Description:
 */
package cn.ghy.mapper;

import cn.ghy.model.MemberLog;
import java.util.List;

public interface MemberLogMapper {

  int deleteByPrimaryKey(Integer id);

  int insert(MemberLog record);

  MemberLog selectByPrimaryKey(Integer id);

  List<MemberLog> selectAll();

  int updateByPrimaryKey(MemberLog record);
}