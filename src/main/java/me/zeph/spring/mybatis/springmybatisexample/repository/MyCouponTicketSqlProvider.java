package me.zeph.spring.mybatis.springmybatisexample.repository;

import org.apache.ibatis.jdbc.SQL;

import static java.lang.String.format;
import static me.zeph.spring.mybatis.springmybatisexample.security.CurrentAuditorService.getCurrentAuditor;

public class MyCouponTicketSqlProvider {

  public String findByCode() {
    return new SQL()
        .SELECT("*")
        .FROM("MY_COUPON_TICKET")
        .WHERE("CODE = #{code}")
        .toString();
  }

  public String insert() throws Exception {
    return new SQL()
        .INSERT_INTO("MY_COUPON_TICKET")
        .VALUES("CODE", "#{code}")
        .VALUES("TYPE", "#{type}")
        .VALUES("CREATED_BY", format("\'%s\'", getCurrentAuditor()))
        .toString();
  }

}
