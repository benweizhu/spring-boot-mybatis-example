package me.zeph.spring.mybatis.springmybatisexample.repository;

import org.junit.jupiter.api.Test;

class MyCouponTicketSqlProviderTest {
  @Test
  void print() {
    System.out.println(new MyCouponTicketSqlProvider().findByCode());
  }
}