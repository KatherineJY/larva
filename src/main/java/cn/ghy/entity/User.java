package cn.ghy.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/9/1 23:21
 * @Description:
 */
public class User implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 用户Id
   */
  @TableId(value = "uid", type = IdType.AUTO)
  private Integer uid;
  /**
   * 用户名
   */
  private String userName;
  /**
   * 真实姓名
   */
  private String realName;
  /**
   * 电子邮箱
   */
  private String email;
  /**
   * 密码
   */
  private String password;
  /**
   * 头像地址
   */
  private String avatar;
  /**
   * 用户创建时间
   */
  private Date createTime;
  /**
   * 上次修改信息时间
   */
  private Date modifiedTime;
  /**
   * 标记是否可用
   */
  private Integer isAvaliable;


  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(Date modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

  public Integer getIsAvaliable() {
    return isAvaliable;
  }

  public void setIsAvaliable(Integer isAvaliable) {
    this.isAvaliable = isAvaliable;
  }

  @Override
  public String toString() {
    return "User{" +
        ", uid=" + uid +
        ", userName=" + userName +
        ", realName=" + realName +
        ", email=" + email +
        ", password=" + password +
        ", avatar=" + avatar +
        ", createTime=" + createTime +
        ", modifiedTime=" + modifiedTime +
        ", isAvaliable=" + isAvaliable +
        "}";
  }
}
