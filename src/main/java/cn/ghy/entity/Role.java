package cn.ghy.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/9/1 23:21
 * @Description:
 */
public class Role implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 角色id
   */
  @TableId(value = "id", type = IdType.AUTO)
  private Integer id;
  /**
   * 角色名称
   */
  private String roleName;
  /**
   * 角色描述
   */
  private String description;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Role{" +
        ", id=" + id +
        ", roleName=" + roleName +
        ", description=" + description +
        "}";
  }
}
