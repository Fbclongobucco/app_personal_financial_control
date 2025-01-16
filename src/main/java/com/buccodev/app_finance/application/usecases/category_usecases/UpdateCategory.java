package com.buccodev.app_finance.application.usecases.category_usecases;

import com.buccodev.app_finance.core.entities.Category;

public interface UpdateCategory {

    void updateName(Long id, Category category);
    Category existisByName(String name);
}
