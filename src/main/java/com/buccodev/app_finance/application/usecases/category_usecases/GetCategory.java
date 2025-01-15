package com.buccodev.app_finance.application.usecases.category_usecases;

import com.buccodev.app_finance.core.entities.Category;

import java.util.List;

public interface GetCategory {

    Category getCategoryById(Long id);
    Category getCategoryByName(String name);
    List<Category> getAllCategoryByRevenues();
    List<Category> getAllCategoryByExpenses();
}
