package me.zeph.spring.mybatis.springmybatisexample.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MyCouponTicketUpdateRequest {
  private String code;
  private int type;
}
