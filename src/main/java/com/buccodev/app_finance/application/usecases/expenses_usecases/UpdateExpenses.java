package com.buccodev.app_finance.application.usecases.expenses_usecases;

import com.buccodev.app_finance.core.entities.Category;
import com.buccodev.app_finance.core.entities.Expenses;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface UpdateExpenses {

    void updateDestination(Long id, String destination);
    void updateTermPayment(Long id, LocalDate termPayment);
    void updateAmount(Long id, BigDecimal amount);
    void updateIsPaid(Long id, Boolean isPaid);
    void updateCategory(Long id, Category category);
    Expenses findExpensesById(Long id);
}
