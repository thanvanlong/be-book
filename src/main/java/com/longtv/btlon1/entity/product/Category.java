package com.longtv.btlon1.entity.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private LocalDateTime publishedDate;

//    @ManyToMany(mappedBy = "categories", fetch = FetchType.LAZY)
//    private Set<Book> books;

    public Category(String title, LocalDateTime publishedDate) {
        this.title = title;
        this.publishedDate = publishedDate;
    }
}