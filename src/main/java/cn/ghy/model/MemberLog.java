package cn.ghy.model;

import java.util.Date;

public class MemberLog {

  private Integer id;

  private Integer uid;

  private Byte action;

  private String ipAddress;

  private Date createTime;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

  public Byte getAction() {
    return action;
  }

  public void setAction(Byte action) {
    this.action = action;
  }

  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress == null ? null : ipAddress.trim();
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  @Override
  public String toString() {
    return "MemberLog{" +
        "id=" + id +
        ", uid=" + uid +
        ", action=" + action +
        ", ipAddress='" + ipAddress + '\'' +
        ", createTime=" + createTime +
        '}';
  }
}