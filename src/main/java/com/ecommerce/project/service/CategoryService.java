package com.ecommerce.project.service;

import com.ecommerce.project.database.dto.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    void createCategory(Category category);

    String deleteCategory(Long categoryId);

    Category updateCategory(Category category, Long categoryId);

    Category findById(Long id);
}
