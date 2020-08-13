package me.zeph.spring.mybatis.springmybatisexample.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PageRequest {

  private int page;
  private int pageSize;

  public int getOffset() {
    if (page < 1) {
      return 0;
    }
    return (page - 1) * pageSize;
  }

  public int getLimit() {
    if (page < 1) {
      return pageSize;
    }
    return page * pageSize;
  }
}
