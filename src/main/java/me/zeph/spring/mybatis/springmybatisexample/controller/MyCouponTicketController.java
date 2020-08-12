package me.zeph.spring.mybatis.springmybatisexample.controller;

import me.zeph.spring.mybatis.springmybatisexample.mapper.MyCouponTicketMapper;
import me.zeph.spring.mybatis.springmybatisexample.model.MyCouponTicket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyCouponTicketController {

  @Autowired
  private MyCouponTicketMapper myCouponTicketMapper;

  @GetMapping(value = "/tickets/{code}")
  public ResponseEntity<MyCouponTicket> findTicketByCode(@PathVariable String code) {
    return new ResponseEntity<>(myCouponTicketMapper.findByCode(code), HttpStatus.OK);
  }

  @PostMapping(value = "/tickets")
  public ResponseEntity<MyCouponTicket> saveTicket(@RequestBody MyCouponTicket myCouponTicket){
    MyCouponTicket savedMyCouponTicket = myCouponTicketMapper.findById(myCouponTicketMapper.insert(myCouponTicket));
    return new ResponseEntity<>(savedMyCouponTicket, HttpStatus.OK);
  }

}
