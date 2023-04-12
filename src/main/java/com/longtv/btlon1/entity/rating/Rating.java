package com.longtv.btlon1.entity.rating;


import com.longtv.btlon1.entity.product.Book;
import com.longtv.btlon1.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private float star;
    private String comment;
    @ManyToOne
    private User user;
    @ManyToOne
    private Book book;
    private LocalDate localDate;
}
