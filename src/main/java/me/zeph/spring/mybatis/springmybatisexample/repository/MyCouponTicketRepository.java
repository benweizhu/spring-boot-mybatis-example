package me.zeph.spring.mybatis.springmybatisexample.repository;

import me.zeph.spring.mybatis.springmybatisexample.model.MyCouponTicket;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MyCouponTicketRepository {

  @SelectProvider(type = MyCouponTicketSqlProvider.class, method = "findByCode")
  Optional<MyCouponTicket> findByCode(@Param("code") String code);

  @Select("SELECT * FROM MY_COUPON_TICKET WHERE ID = #{id}")
  Optional<MyCouponTicket> findById(@Param("id") long id);

  @InsertProvider(type = MyCouponTicketSqlProvider.class, method = "insert")
  int save(MyCouponTicket myCouponTicket);

  @SelectProvider(type = MyCouponTicketSqlProvider.class, method = "findAll")
  List<MyCouponTicket> findAll(RowBounds rowBounds);

  @UpdateProvider(type = MyCouponTicketSqlProvider.class, method = "update")
  int update(MyCouponTicket myCouponTicket);
}