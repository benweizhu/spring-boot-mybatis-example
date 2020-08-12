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

  private long id;
  private String code;
  private int type;
  private int createdBy;
  private LocalDateTime createdTime;
}
