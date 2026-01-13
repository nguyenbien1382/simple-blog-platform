package com.bien.blog.services;

import com.bien.blog.domain.entities.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    List<Category> listCategories();
    Category createCategory(Category category);
    void deleteCategoryById(UUID categoryId);
    Category getCategoryById(UUID categoryId);
}
