package com.longtv.btlon1.controller;


import com.longtv.btlon1.entity.ResponseDTO;
import com.longtv.btlon1.entity.order.Order;
import com.longtv.btlon1.entity.order.State;
import com.longtv.btlon1.entity.product.Book;
import com.longtv.btlon1.entity.user.User;
import com.longtv.btlon1.service.order.OrderService;
import com.longtv.btlon1.service.product.BookService;
import com.longtv.btlon1.service.user.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping(value = "/api/order")
public class OrderController {
    @Autowired
    UserService userService;
    @Autowired
    OrderService orderService;
    @Autowired
    BookService bookService;

    @PostMapping("/book")
    public ResponseEntity<ResponseDTO<?>> orderBook(@RequestBody Order order) {
        System.out.println("longtv:   "+ order.getBooks().size());
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(principal.toString());
        User user = userService.getOneByEmail(principal.toString());
        Iterator<Book> iterable = order.getBooks().iterator();
        int i = 0;
        while(iterable.hasNext()) {
            Book book = iterable.next();
            Book newBook = bookService.getOneById(book.getId());
            System.out.println("longtv" + newBook.getTotalQuantity());
            if (newBook.getTotalQuantity() < order.getQuanityList().get(i)) {
                return ResponseEntity.ok(new ResponseDTO<>("So luong sach khong con du", "400", ""));
            }
            System.out.println(newBook.getName() + " longtv book name");
            newBook.setBuyCount(newBook.getBuyCount() + order.getQuanityList().get(i));
            newBook.setTotalQuantity(newBook.getTotalQuantity() - order.getQuanityList().get(i));
            bookService.save(newBook);
            i++;
        }
        order.setUser(user);
        order.setLocalDateTime(LocalDateTime.now());
        boolean check = orderService.save(order);
        if (order.getPaymentType() == 0) {
            if (check) {
                return ResponseEntity.ok(new ResponseDTO<>("Thanh cong", "200", ""));
            }else {
                return ResponseEntity.ok(new ResponseDTO<>("Da co loi xay ra vui long thu lai", "400", "Da co loi xay ra vui long thu lai"));
            }
        } else {
            //TODO thanh toan bang momo
            if (check) {
                return ResponseEntity.ok(new ResponseDTO<>("Thanh cong", "200", ""));
            }else {
                return ResponseEntity.ok(new ResponseDTO<>("Da co loi xay ra vui long thu lai", "400", "Da co loi xay ra vui long thu lai"));
            }
        }


    }

    @GetMapping("/order/get")
    public List<Order> getAll() {
        return orderService.getAll();
    }

    @GetMapping("/get")
    public ResponseEntity<ResponseDTO<List<Order>>> getOrderById() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(principal.toString());
        User user = userService.getOneByEmail(principal.toString());
        return ResponseEntity.ok(new ResponseDTO<>(orderService.getByUserId(user.getId()), "200", ""));
    }

    @PutMapping("/update")
    public void update(@RequestBody State state) {
        System.out.println("longtv----------" + " " + state.getId());
        orderService.update(state.getId(), state.getStatus());
    }


}
