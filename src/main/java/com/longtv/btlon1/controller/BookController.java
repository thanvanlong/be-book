package com.longtv.btlon1.controller;


import com.google.gson.Gson;
import com.longtv.btlon1.entity.ResponseDTO;
import com.longtv.btlon1.entity.product.Book;
import com.longtv.btlon1.entity.product.Category;
import com.longtv.btlon1.service.product.BookService;
import com.longtv.btlon1.service.product.CategoryService;
import com.longtv.btlon1.utils.CloudinaryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/book")
@CrossOrigin("*")
public class BookController {

    @Autowired
    BookService service;
    @Autowired
    CategoryService categoryService;

    @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO<List<Book>>> getAllWithPage(@RequestParam("page") String page) {
        List<Book> bookList = service.getAllWithPage(Integer.parseInt(page));
        System.out.println(bookList.size());
        return ResponseEntity.ok(new ResponseDTO<List<Book>>(bookList, "200", "Success"));
    }
    @GetMapping(value = "/get-all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO<List<Book>>> getAll() {
        List<Book> bookList = service.getAll();
        return ResponseEntity.ok(new ResponseDTO<List<Book>>(bookList, "200", "Success"));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO<?>> getOne(@PathVariable("id") String id) {
        long idBook = Long.parseLong(id);
        Book book = service.getOneById(idBook);
        if (book == null) {
            return ResponseEntity.ok(new ResponseDTO<String>("Không tìm thấy sách", "404", "Failed"));
        }

        return ResponseEntity.ok(new ResponseDTO<Book>(book, "200", "Success"));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO<String>> deleteBook(@PathVariable("id") String id) {
        Book book = service.getOneById(Long.parseLong(id));
        if (book == null) {
            return ResponseEntity.ok(new ResponseDTO<String>("Không tìm thấy sách để xoá", "404", "Failed"));
        }

        boolean rs = service.deleteOneById(Long.parseLong(id));

        if (!rs) {
            return ResponseEntity.ok(new ResponseDTO<String>("Xoá sách không thành công", "404", "Failed"));
        }
        CloudinaryUtils.deleteImg(book.getName());

        return ResponseEntity.ok(new ResponseDTO<String>("Xoá sách thành công", "200", "Success"));
    }

    @PostMapping(value ="/save",  produces = {MediaType.IMAGE_PNG_VALUE, MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<ResponseDTO<String>> addBook(@RequestParam(name="file") MultipartFile file, @RequestParam("data") String data) {
        System.out.println("saveee long");
        Gson gson = new Gson();

        Book book;
        try{
            book = gson.fromJson(data, Book.class);
        } catch (Exception e) {
            return ResponseEntity.ok(new ResponseDTO<String>("Kiểu dữ liệu của sách không hợp lệ", "404", "Failed"));
        }

        if (book == null) {
            return ResponseEntity.ok(new ResponseDTO<String>("Sách không hợp lệ", "404", "Failed"));
        }

        if (service.getOneByName(book.getName()) != null) {
            return ResponseEntity.ok(new ResponseDTO<String>("Tên sách đã được dùng trước đó vui lòng thử lại tên khác!!", "404", "Failed"));
        }

        Set<Category> categories = new HashSet<>();
        for (Category category : book.getCategories()
                ) {
            if (categoryService.getByName(category.getTitle()) == null) {
                return ResponseEntity.ok(new ResponseDTO<String>("Thể loại của sách không hợp lệ", "404", "Failed"));
            } else {
                categories.add(categoryService.getByName(category.getTitle()));
            }
        }
        String imgUrl = "";
        String []typeImg = {"image/png", "image/jpeg"};
        if (!Arrays.asList(typeImg).contains(file.getContentType())) {
            return ResponseEntity.ok(new ResponseDTO<String>("Thể loại của ảnh không hợp lệ", "404", "Failed"));
        }
        System.out.println(file.getContentType());
        try {
             imgUrl = CloudinaryUtils.uploadImg(file.getBytes(), book.getName());
        } catch (IOException e) {
            return ResponseEntity.ok(new ResponseDTO<String>("Upload ảnh lên không thành công", "404", "Failed"));
        }
        LocalDate dt = LocalDate.parse(book.getPublishDate());
        if (dt.isAfter(LocalDate.now())) {
            return ResponseEntity.ok(new ResponseDTO<String>("Ngày phát hành phải lớn hơn hoặc là ngày hiện tại", "404", "Failed"));
        }
        book.setPublishedDate(dt);
        book.setCategories(categories);
        book.setImgUrl(imgUrl);
        boolean rs = service.save(book);

        if (!rs) {
            return ResponseEntity.ok(new ResponseDTO<String>("Lưu sách không thành công", "404", "Failed"));
        }

        return ResponseEntity.ok(new ResponseDTO<String>("Thành công lưu sách!!!", "200", "Success"));
    }


    @PutMapping(value="/update", produces = {MediaType.IMAGE_PNG_VALUE, MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<ResponseDTO<?>> update(@RequestParam(value = "file", required = false) MultipartFile file, @RequestParam("data") String data) {
        if (data == null) {
            return ResponseEntity.ok(new ResponseDTO<String>("Không tìm thấy sách để cập nhật", "404", "Failed"));
        }

        Gson gson = new Gson();

        Book book;
        try{
            book = gson.fromJson(data, Book.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.ok(new ResponseDTO<String>("Kiểu dữ liệu của sách không hợp lệ", "404", "Failed"));
        }

        if (book == null) {
            return ResponseEntity.ok(new ResponseDTO<String>("Sách không hợp lệ", "404", "Failed"));
        }

        if (service.getOneById(book.getId()) == null) {
            return ResponseEntity.ok(new ResponseDTO<String>("Không tìm thấy sách để cập nhật", "404", "Failed"));
        }


        Set<Category> categories = new HashSet<>();
        for (Category category : book.getCategories()
        ) {
            if (categoryService.getByName(category.getTitle()) == null) {
                return ResponseEntity.ok(new ResponseDTO<String>("Thể loại của sách không hợp lệ", "404", "Failed"));
            } else {
                categories.add(categoryService.getByName(category.getTitle()));
            }
        }

        String imgUrl = "";
        if (file != null) {
            String []typeImg = {"image/png", "image/jpeg"};
            if (!Arrays.asList(typeImg).contains(file.getContentType())) {
                return ResponseEntity.ok(new ResponseDTO<String>("Thể loại của ảnh không hợp lệ", "404", "Failed"));
            }
            System.out.println(file.getContentType());
            try {
                imgUrl = CloudinaryUtils.uploadImg(file.getBytes(), book.getName());
            } catch (IOException e) {
                return ResponseEntity.ok(new ResponseDTO<String>("Upload ảnh lên không thành công", "404", "Failed"));
            }
        }

        LocalDate dt = LocalDate.parse(book.getPublishDate());
        if (dt.isAfter(LocalDate.now())) {
            return ResponseEntity.ok(new ResponseDTO<String>("Ngày phát hành phải lớn hơn hoặc là ngày hiện tại", "404", "Failed"));
        }
        book.setPublishedDate(dt);
        book.setCategories(categories);
        if (!imgUrl.matches("")) {
            book.setImgUrl(imgUrl);
        }
        boolean rs = service.save(book);

        if (!rs) {
            return ResponseEntity.ok(new ResponseDTO<String>("Cập nhật sách không thành công", "404", "Failed"));
        }

        return ResponseEntity.ok(new ResponseDTO<String>("Thành công cập nhật sách!!!", "200", "Success"));
    }

}
