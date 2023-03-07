package com.Hostel.main.service;

import com.Hostel.main.model.Category;
import com.Hostel.main.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAllCategory(){
        return categoryRepository.findAll();
    }

    public Category addCategory(Category category){
//        Category category1 = new Category();
        return categoryRepository.save(category);
    }
}
