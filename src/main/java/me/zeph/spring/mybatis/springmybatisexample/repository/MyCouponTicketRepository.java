package me.zeph.spring.mybatis.springmybatisexample.repository;

import me.zeph.spring.mybatis.springmybatisexample.model.MyCouponTicket;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

@Mapper
public interface MyCouponTicketRepository {

  @SelectProvider(type = MyCouponTicketProvider.class, method = "findByCode")
  MyCouponTicket findByCode(@Param("code") String code);

  @Select("SELECT * FROM MY_COUPON_TICKET WHERE ID = #{id}")
  MyCouponTicket findById(@Param("id") long id);

  @InsertProvider(type = MyCouponTicketProvider.class, method = "save")
  long save(MyCouponTicket myCouponTicket);

}