package com.buccodev.app_finance.application.usecases.revenues_usecases;

import com.buccodev.app_finance.core.entities.Category;
import com.buccodev.app_finance.core.entities.Revenues;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface UpdateRevenues {

    void updateOrigin(Long id, Revenues revenues);
    void updateReceiptDate(LocalDate receiptDate);
    void updateAmount(BigDecimal amount);
    void updateCategory(Category category);
    Revenues findRevenueById(Long id);
}
