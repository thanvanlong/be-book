package com.longtv.btlon1.entity.order;

import com.longtv.btlon1.entity.product.Book;
import com.longtv.btlon1.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document("Booking")
public class Order {
    @Id
    private String id;
    private Set<Book> books;
    private List<Integer> quanityList;
    private User user;
    private String name;
    private String address;
    private String phoneNumber;
    private LocalDateTime localDateTime;
    private int status;
    private int paymentType;
    private String note;
    private LocalDateTime createdAt;

}
