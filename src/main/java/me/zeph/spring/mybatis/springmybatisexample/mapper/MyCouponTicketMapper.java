package me.zeph.spring.mybatis.springmybatisexample.mapper;

import me.zeph.spring.mybatis.springmybatisexample.model.MyCouponTicket;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MyCouponTicketMapper {

  @Select("SELECT * FROM my_coupon_ticket WHERE code = #{code}")
  MyCouponTicket findByCode(@Param("code") String code);

}