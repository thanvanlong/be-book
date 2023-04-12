package com.longtv.btlon1.entity.order;

import com.longtv.btlon1.entity.product.Book;
import com.longtv.btlon1.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Booking")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Book> books;
    @ElementCollection
    private List<Integer> quanityList;
    @OneToOne
    private User user;
    private String name;
    private String address;
    private String phone;
    private LocalDateTime localDateTime;
    private int status;
    private int paymentType;
    private String note;

}
