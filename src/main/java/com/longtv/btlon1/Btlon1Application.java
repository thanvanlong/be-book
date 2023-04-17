package com.longtv.btlon1;

import com.longtv.btlon1.entity.product.Book;
import com.longtv.btlon1.entity.product.Category;
import com.longtv.btlon1.entity.user.Role;
import com.longtv.btlon1.entity.user.User;
import com.longtv.btlon1.repo.product.BookRepo;
import com.longtv.btlon1.service.mail.EmailSender;
import com.longtv.btlon1.repo.user.UserRepo;
import com.longtv.btlon1.service.product.BookService;
import com.longtv.btlon1.service.product.CategoryService;
import com.longtv.btlon1.service.user.RoleService;
import com.longtv.btlon1.service.user.UserService;
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
    UserRepo userRepo;

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
            int checkRole = roleService.getAll().size();
            if(checkRole == 0){
                roleService.saveRole(new Role("ROLE_USER"));
                roleService.saveRole(new Role("USER_ADMIN"));
            }

            int checkUser = userRepo.findAll().size();
            if(checkUser == 0){
                Role role = roleService.findByName("ROLE_USER");
                List<Role> roles = new ArrayList<>();
                roles.add(role);
                User user = new User();
                user.setEmail("admin@gmail.com");
                user.setPassword("$2a$10$2cqVlUAoAYt4Ay7YbO8uceZph2VYMBGVDYMAIoqlkrr.iBiGKP7/W");
                user.setRoles(roles);
                userRepo.save(user);
            }

            int checkBook = categoryService.getAll().size();
            if(checkBook == 0) {
//                List<Category> list = new ArrayList<>();
                categoryService.save(new Category("The loai 1", LocalDateTime.now()));
                categoryService.save(new Category("The loai 2", LocalDateTime.now()));
                categoryService.save(new Category("The loai 3", LocalDateTime.now()));
                categoryService.save(new Category("The loai 4", LocalDateTime.now()));

                System.out.println(categoryService.getAll().size());
                Set<Category> categories = new HashSet<>(categoryService.getAll());
                Thread.sleep(1000);

                for (int i = 0; i < 100; i++) {
                    Book book = new Book(10000, "Kim Dong","One Piece" + i, "Kim Dong", 100, "https://cdn0.fahasa.com/media/catalog/product/i/m/image_217703.jpg", "No desc", LocalDate.now(), categories, 10);
                    service.save(book);
                }
            }

//            Pageable pageable = PageRequest.of(0, 5);
//            List<Book> list = bookRepo.findAllByNameContains("One", pageable);
//            System.out.println(list.size());
        };
    }
}
