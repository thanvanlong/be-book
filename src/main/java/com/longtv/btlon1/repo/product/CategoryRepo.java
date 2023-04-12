package com.longtv.btlon1.repo.product;

import com.longtv.btlon1.entity.product.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {

    Category findByTitle(String title);

}
