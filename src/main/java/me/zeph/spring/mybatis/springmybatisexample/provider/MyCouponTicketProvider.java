package me.zeph.spring.mybatis.springmybatisexample.provider;

import org.apache.ibatis.jdbc.SQL;

public class MyCouponTicketProvider {

  public String findByCode() {
    return new SQL()
        .SELECT("*")
        .FROM("MY_COUPON_TICKET")
        .WHERE("CODE = #{code}")
        .toString();
  }
}
