package me.zeph.spring.mybatis.springmybatisexample.model;

import java.time.LocalDateTime;

public class MyCouponTicket {

  private long id;
  private String code;
  private int type;
  private int createdBy;
  private LocalDateTime createdTime;

  public MyCouponTicket() {
  }

  public MyCouponTicket(long id, String code, int type) {
    this.id = id;
    this.code = code;
    this.type = type;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public int getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(int createdBy) {
    this.createdBy = createdBy;
  }

  public LocalDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(LocalDateTime createdTime) {
    this.createdTime = createdTime;
  }
}
