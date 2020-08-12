package me.zeph.spring.mybatis.springmybatisexample.controller;

import lombok.AllArgsConstructor;
import me.zeph.spring.mybatis.springmybatisexample.model.MyCouponTicket;
import me.zeph.spring.mybatis.springmybatisexample.repository.MyCouponTicketRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MyCouponTicketController {

  private final MyCouponTicketRepository myCouponTicketRepository;

  @GetMapping(value = "/tickets/{code}")
  public ResponseEntity<MyCouponTicket> findTicketByCode(@PathVariable String code) {
    return new ResponseEntity<>(myCouponTicketRepository.findByCode(code), HttpStatus.OK);
  }

  @PostMapping(value = "/tickets")
  public ResponseEntity<MyCouponTicket> saveTicket(@RequestBody MyCouponTicket myCouponTicket){
    MyCouponTicket savedMyCouponTicket = myCouponTicketRepository.findById(myCouponTicketRepository.save(myCouponTicket));
    return new ResponseEntity<>(savedMyCouponTicket, HttpStatus.OK);
  }

}
