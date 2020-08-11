package me.zeph.spring.mybatis.springmybatisexample.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MyCouponTicket {
  private long id;
  private String code;
  private int type;
}
