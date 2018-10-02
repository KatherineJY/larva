package cn.ghy.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @Author: Ziyang
 * @Email: meetziyang@gmail.com
 * @Date: 2018/10/1 23:38
 * @Description: 用户
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
  @NotNull
  @Size(min = 3, max = 20)
  private String userName;
  /**
   * 真实姓名
   */
  @NotNull
  @Size(min = 2, max = 15)
  private String realName;
  /**
   * 电子邮箱
   */
  @NotNull
  @Email
  private String email;
  /**
   * 密码
   */

  @NotNull
  //必须包含大小写字母和数字的组合，可以使用特殊字符，长度在6-20之间
  @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$$")
  private String password;
  /**
   * 头像地址
   */
  @NotNull
  @Pattern(regexp = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp))$)")
  private String avatar;
  /**
   * 创建时间
   */
  @Past
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss:SSS")
  private Date createTime;
  /**
   * 上次修改时间
   */
  @Past
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss:SSS")
  private Date modifiedTime;
  /**
   * 是否可用
   */
  private Integer isEnabled;
  /**
   * 是否逻辑删除
   */
  private Integer isDeleted;


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
    if (avatar.isEmpty()) {
      this.avatar = "/upload/avatar/default.png";
    } else {
      this.avatar = avatar;
    }
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

  public Integer getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Integer isEnabled) {
    this.isEnabled = isEnabled;
  }

  public Integer getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Integer isDeleted) {
    this.isDeleted = isDeleted;
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
        ", isEnabled=" + isEnabled +
        ", isDeleted=" + isDeleted +
        "}";
  }
}
