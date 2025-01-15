package com.buccodev.app_finance.application.usecases.category_usecases;

import com.buccodev.app_finance.core.entities.Category;

public interface CreateCategory {

    Long saveCategory(Category category);
    Category existsByName(String name);
}
