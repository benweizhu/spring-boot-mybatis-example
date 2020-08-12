package me.zeph.spring.mybatis.springmybatisexample.controller;

import com.github.pagehelper.PageRowBounds;
import lombok.AllArgsConstructor;
import me.zeph.spring.mybatis.springmybatisexample.model.MyCouponTicket;
import me.zeph.spring.mybatis.springmybatisexample.model.PageRequest;
import me.zeph.spring.mybatis.springmybatisexample.model.PageResponnse;
import me.zeph.spring.mybatis.springmybatisexample.repository.MyCouponTicketRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MyCouponTicketController {

  private final MyCouponTicketRepository myCouponTicketRepository;

  @GetMapping(value = "/tickets/code/{code}")
  public ResponseEntity<MyCouponTicket> findTicketByCode(@PathVariable String code) {
    return new ResponseEntity<>(myCouponTicketRepository.findByCode(code), HttpStatus.OK);
  }

  @GetMapping(value = "/tickets")
  public ResponseEntity<PageResponnse> getTicketsByPage(@RequestParam(name = "page") long page, @RequestParam(name = "page_size") long pageSize) {
    PageRequest pageRequest = PageRequest.builder().page(page).pageSize(pageSize).build();
    PageRowBounds rowBounds = new PageRowBounds(0, 1);
    List<MyCouponTicket> tickets = myCouponTicketRepository.findAll(rowBounds);

    return new ResponseEntity<>(PageResponnse.builder().body(tickets).total(rowBounds.getTotal()).build(), HttpStatus.OK);
  }

  @PostMapping(value = "/tickets")
  public ResponseEntity<MyCouponTicket> saveTicket(@RequestBody MyCouponTicket myCouponTicket) {
    MyCouponTicket savedMyCouponTicket = myCouponTicketRepository.findById(myCouponTicketRepository.save(myCouponTicket));
    return new ResponseEntity<>(savedMyCouponTicket, HttpStatus.OK);
  }

}
