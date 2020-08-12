package me.zeph.spring.mybatis.springmybatisexample.model;

public class MyCouponTicket {

  private long id;
  private String code;
  private int type;

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
}
