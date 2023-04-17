package com.longtv.btlon1.entity.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Set;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    private String id;
    private String title;
    private LocalDateTime publishedDate;

//    @ManyToMany(mappedBy = "categories", fetch = FetchType.LAZY)
//    private Set<Book> books;

    public Category(String title, LocalDateTime publishedDate) {
        this.title = title;
        this.publishedDate = publishedDate;
    }
}
