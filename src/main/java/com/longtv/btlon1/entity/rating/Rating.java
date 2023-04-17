package com.longtv.btlon1.entity.rating;


import com.longtv.btlon1.entity.product.Book;
import com.longtv.btlon1.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
    @Id
    private String id;
    private float star;
    private String comment;
    private User user;
    private Book book;
    private LocalDate localDate;
}
