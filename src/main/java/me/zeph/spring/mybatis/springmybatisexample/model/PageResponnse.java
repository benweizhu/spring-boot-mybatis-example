package me.zeph.spring.mybatis.springmybatisexample.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PageResponnse<T> {
  private T body;
  private long totalPage;
  private long currentPage;
  private long total;
  private long pageSize;
}
