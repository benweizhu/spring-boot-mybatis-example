package me.zeph.spring.mybatis.springmybatisexample.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PageRequest {
  private long page;
  private long pageSize;
}
