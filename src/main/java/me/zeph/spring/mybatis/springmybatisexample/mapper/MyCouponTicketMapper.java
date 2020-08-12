package me.zeph.spring.mybatis.springmybatisexample.mapper;

import me.zeph.spring.mybatis.springmybatisexample.model.MyCouponTicket;
import me.zeph.spring.mybatis.springmybatisexample.provider.MyCouponTicketProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

@Mapper
public interface MyCouponTicketMapper {

  @SelectProvider(type = MyCouponTicketProvider.class, method = "findByCode")
  MyCouponTicket findByCode(@Param("code") String code);

  @Select("SELECT * FROM MY_COUPON_TICKET WHERE ID = #{id}")
  MyCouponTicket findById(@Param("id") long id);

  @Insert("INSERT INTO MY_COUPON_TICKET(CODE, TYPE, CREATED_BY, CREATED_TIME) VALUES(#{code}, #{type}, #{createdBy}, #{createdTime})")
  long insert(MyCouponTicket myCouponTicket);

}