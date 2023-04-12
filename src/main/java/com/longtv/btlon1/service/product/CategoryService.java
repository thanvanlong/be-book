package com.longtv.btlon1.service.product;

import com.longtv.btlon1.entity.product.Category;

import java.util.List;

public interface CategoryService {
    boolean save(Category category);
    Category getByName(String name);
    List<Category> getAll();
}
