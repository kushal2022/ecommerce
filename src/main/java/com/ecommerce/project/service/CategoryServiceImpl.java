package com.ecommerce.project.service;

import com.ecommerce.project.database.dao.CategoryRepository;
import com.ecommerce.project.database.dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void createCategory(Category category) {
        Category newCategory = new Category();
        newCategory.setCategoryName((category.getCategoryName()));
        categoryRepository.save(newCategory);
    }

    @Override
    public String deleteCategory(Long categoryId) {
        categoryRepository.deleteById(categoryId);
        return "Category with categoryId : " + categoryId + " deleted successfully";
    }

    @Override
    public Category updateCategory(Category category, Long categoryId) {
        Optional<Category> entity = categoryRepository.findById(categoryId);
        if(entity.isPresent()){
            Category updateCategory = entity.get();
            updateCategory.setCategoryName(category.getCategoryName());
            return categoryRepository.save(updateCategory);
        }
        return null;
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }
}
