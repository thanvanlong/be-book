package com.longtv.btlon1.entity.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    private String id;
    @NonNull
    private String company;
    @NonNull
    private String name;
    @NonNull
    private String author;
    @NonNull
    private int pageCount;
    @NonNull
    private String imgUrl;
    private String description;
    @NonNull
    private LocalDate publishedDate;
    @Transient
    private String publishDate;
    @NonNull
    private int price;
    private int buyCount;
    @NonNull
    private int totalQuantity;
    private int quanityOrdered;

    private LocalDateTime updateAt;
    private Set<Category> categories;


    public Book(@NonNull String company, @NonNull String name, @NonNull String author, @NonNull int pageCount, @NonNull String imgUrl, String description, LocalDate publishedDate, Set<Category> categories) {
        this.company = company;
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
        this.imgUrl = imgUrl;
        this.description = description;
        this.publishedDate = publishedDate;
        this.categories = categories;
    }

    public Book(@NonNull int price, @NonNull String company, @NonNull String name, @NonNull String author, @NonNull int pageCount, @NonNull String imgUrl, String description, LocalDate publishedDate, Set<Category> categories,  @NonNull int totalQuantity) {
        this.company = company;
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
        this.imgUrl = imgUrl;
        this.description = description;
        this.publishedDate = publishedDate;
        this.categories = categories;
        this.price = price;
        this.totalQuantity = totalQuantity;
    }


    public Book(@NonNull String company, @NonNull String name, @NonNull String author, @NonNull int pageCount, @NonNull String imgUrl, String description, @NonNull LocalDate publishedDate, @NonNull int price, @NonNull int totalQuantity, Set<Category> categories) {
        this.company = company;
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
        this.imgUrl = imgUrl;
        this.description = description;
        this.publishedDate = publishedDate;
        this.price = price;
        this.totalQuantity = totalQuantity;
        this.categories = categories;
    }
}
