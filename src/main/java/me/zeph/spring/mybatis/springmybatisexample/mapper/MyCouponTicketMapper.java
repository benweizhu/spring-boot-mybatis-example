package me.zeph.spring.mybatis.springmybatisexample.mapper;

import me.zeph.spring.mybatis.springmybatisexample.model.MyCouponTicket;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MyCouponTicketMapper {

  @Select("SELECT * FROM my_coupon_ticket WHERE code = #{code}")
  MyCouponTicket findByCode(@Param("code") String code);

  @Select("SELECT * FROM my_coupon_ticket WHERE id = #{id}")
  MyCouponTicket findById(@Param("id") long id);

  @Insert("INSERT INTO my_coupon_ticket(code, type, created_by, created_time) VALUES(#{code}, #{type}, #{createdBy}, #{createdTime})")
  long insert(MyCouponTicket myCouponTicket);

}