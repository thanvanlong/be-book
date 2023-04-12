package com.longtv.btlon1.repo.product;

import com.longtv.btlon1.entity.product.Book;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
    Book findById(long id);
    Book findByName(String name);

    List<Book> findAllByNameContains(String name, Pageable pageable);
}
