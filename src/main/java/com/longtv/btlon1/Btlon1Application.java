package com.longtv.btlon1;

import com.longtv.btlon1.entity.product.Book;
import com.longtv.btlon1.entity.product.Category;
import com.longtv.btlon1.entity.user.Role;
import com.longtv.btlon1.repo.product.BookRepo;
import com.longtv.btlon1.service.mail.EmailSender;
import com.longtv.btlon1.service.product.BookService;
import com.longtv.btlon1.service.product.CategoryService;
import com.longtv.btlon1.service.user.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class Btlon1Application {

    @Autowired
    CategoryService categoryService;
    @Autowired
    RoleService roleService;
    @Autowired
    BookRepo bookRepo;
    @Autowired
    EmailSender emailSender;
    public static void main(String[] args) {
        SpringApplication.run(Btlon1Application.class, args);
    }
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner commandLineRunner(BookService service) {
        return args -> {
//            roleService.saveRole(new Role("ROLE_USER"));
//
//            List<Category> list = new ArrayList<>();
//            categoryService.save(new Category("The loai 1", LocalDateTime.now()));
//            categoryService.save(new Category("The loai 2", LocalDateTime.now()));
//            categoryService.save(new Category("The loai 3", LocalDateTime.now()));
//            categoryService.save(new Category("The loai 4", LocalDateTime.now()));

//            System.out.println(categoryService.getAll().size());
//            Set<Category> categories = new HashSet<>(categoryService.getAll());
////////            Thread.sleep(1000);
//////////
//            for (int i = 0; i < 100; i++) {
//                Book book = new Book(10000, "Kim Dong","One Piece" + i, "Kim Dong", 100, "https://cdn0.fahasa.com/media/catalog/product/i/m/image_217703.jpg", "No desc", LocalDate.now(), categories, 10);
//                service.save(book);
//            }
//            Pageable pageable = PageRequest.of(0, 5);
//            List<Book> list = bookRepo.findAllByNameContains("One", pageable);
//            System.out.println(list.size());
        };
    }
}
