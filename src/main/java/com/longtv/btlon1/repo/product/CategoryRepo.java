package com.longtv.btlon1.repo.product;

import com.longtv.btlon1.entity.product.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepo extends MongoRepository<Category, String> {

    Category findByTitle(String title);

}
