package me.zeph.spring.mybatis.springmybatisexample.mapper;

import me.zeph.spring.mybatis.springmybatisexample.model.MyCouponTicket;
import me.zeph.spring.mybatis.springmybatisexample.provider.MyCouponTicketProvider;
import org.apache.ibatis.annotations.InsertProvider;
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

  @InsertProvider(type = MyCouponTicketProvider.class, method = "insert")
  long insert(MyCouponTicket myCouponTicket);

}