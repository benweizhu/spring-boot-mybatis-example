package me.zeph.spring.mybatis.springmybatisexample.repository;

import org.apache.ibatis.jdbc.SQL;

public class MyCouponTicketProvider {

  public String findByCode() {
    return new SQL()
        .SELECT("*")
        .FROM("MY_COUPON_TICKET")
        .WHERE("CODE = #{code}")
        .toString();
  }

  public String insert() {
    return new SQL()
        .INSERT_INTO("MY_COUPON_TICKET")
        .VALUES("CODE", "#{code}")
        .VALUES("TYPE", "#{type}")
        .VALUES("CREATED_BY", " #{createdBy}")
        .toString();
  }
}
