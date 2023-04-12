package com.longtv.btlon1.service.product;

import com.longtv.btlon1.entity.product.Category;
import com.longtv.btlon1.repo.product.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryRepo categoryRepo;

    @Override
    public boolean save(Category category) {

        try {
            categoryRepo.save(category);
        }catch (Exception e) {
            return false;
        }

        return true;
    }

    @Override
    public Category getByName(String name) {
        return categoryRepo.findByTitle(name);
    }

    @Override
    public List<Category> getAll() {
        return categoryRepo.findAll();
    }
}
