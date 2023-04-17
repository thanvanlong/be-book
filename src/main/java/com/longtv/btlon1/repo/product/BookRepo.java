package com.longtv.btlon1.repo.product;

import com.longtv.btlon1.entity.product.Book;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepo extends MongoRepository<Book, String> {
    Optional<Book> findById(String id);
    Book findByName(String name);

    List<Book> findAllByOrderByUpdateAtDesc();

    List<Book> findAllByNameContains(String name, Pageable pageable);
}
