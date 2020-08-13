package me.zeph.spring.mybatis.springmybatisexample.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PageRequestTest {

  @Test
  void should_return_offset_0_limit_10_when_page_is_1_and_pageSize_10() {
    PageRequest pageRequest = PageRequest.builder().page(1).pageSize(10).build();
    assertEquals(10, pageRequest.getLimit());
    assertEquals(0, pageRequest.getOffset());
  }

  @Test
  void should_return_offset_10_limit_20_when_page_is_2_and_pageSize_10() {
    PageRequest pageRequest = PageRequest.builder().page(2).pageSize(10).build();
    assertEquals(20, pageRequest.getLimit());
    assertEquals(10, pageRequest.getOffset());
  }

}