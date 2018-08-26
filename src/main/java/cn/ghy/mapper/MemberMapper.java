/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/8/26 23:38
 * @Description:
 */
package cn.ghy.mapper;

import cn.ghy.model.Member;
import java.util.List;

public interface MemberMapper {

  int deleteByPrimaryKey(Integer uid);

  int insert(Member record);

  Member selectByPrimaryKey(Integer uid);

  List<Member> selectAll();

  int updateByPrimaryKey(Member record);
}