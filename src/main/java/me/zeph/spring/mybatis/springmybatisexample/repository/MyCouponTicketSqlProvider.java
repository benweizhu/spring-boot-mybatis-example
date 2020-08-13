package me.zeph.spring.mybatis.springmybatisexample.repository;

import org.apache.ibatis.jdbc.SQL;

import static java.lang.String.format;
import static me.zeph.spring.mybatis.springmybatisexample.security.CurrentAuditorService.getCurrentAuditor;

public class MyCouponTicketSqlProvider {

  public String findByCode() {
    return new SQL()
        .SELECT("MY_COUPON_TICKET.CODE, MY_COUPON_TICKET.TYPE, MY_COUPON_TICKET.CREATED_BY, MY_COUPON_TICKET.CREATED_TIME")
        .SELECT("MY_COUPON_TICKET_TYPE.NAME, MY_COUPON_TICKET_TYPE.DESCRIPTION")
        .FROM("MY_COUPON_TICKET")
        .LEFT_OUTER_JOIN("MY_COUPON_TICKET_TYPE ON MY_COUPON_TICKET.TYPE = MY_COUPON_TICKET_TYPE.ID")
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

  public String findAll(){
    return new SQL()
        .SELECT("MY_COUPON_TICKET.CODE, MY_COUPON_TICKET.TYPE, MY_COUPON_TICKET.CREATED_BY, MY_COUPON_TICKET.CREATED_TIME")
        .SELECT("MY_COUPON_TICKET_TYPE.NAME, MY_COUPON_TICKET_TYPE.DESCRIPTION")
        .FROM("MY_COUPON_TICKET")
        .LEFT_OUTER_JOIN("MY_COUPON_TICKET_TYPE ON MY_COUPON_TICKET.TYPE = MY_COUPON_TICKET_TYPE.ID")
        .toString();
  }

}
