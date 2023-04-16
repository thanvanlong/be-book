package com.longtv.btlon1.service.product;

import com.longtv.btlon1.entity.product.Book;
import com.longtv.btlon1.repo.product.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepo bookRepo;

    @Override
    public List<Book> getAllWithPage(int page) {
        Pageable pageable = PageRequest.of(page - 1, 20);
        return bookRepo.findAllByNameContains("", pageable);
    }

    @Override
    public List<Book> getAll() {
        return bookRepo.findAllByOrderByUpdateAtDesc();
    }

    @Override
    public Book getOneById(long id) {
        return bookRepo.findById(id);
    }

    @Override
    public boolean save(Book book) {
        try {
            bookRepo.save(book);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(Book book) {
        try {
            bookRepo.save(book);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Book getOneByName(String name) {
        return bookRepo.findByName(name);
    }

    @Override
    public boolean deleteOneById(long id) {
        bookRepo.deleteById(id);
        return true;
    }
}
