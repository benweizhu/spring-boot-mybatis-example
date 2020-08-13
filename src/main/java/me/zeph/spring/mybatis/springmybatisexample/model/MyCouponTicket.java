package me.zeph.spring.mybatis.springmybatisexample.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MyCouponTicket {

  private String code;
  private int type;
  private String createdBy;
  private LocalDateTime createdTime;
  private String name;
  private String description;
}
