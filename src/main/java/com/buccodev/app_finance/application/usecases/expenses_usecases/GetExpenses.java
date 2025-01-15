package com.buccodev.app_finance.application.usecases.expenses_usecases;

import com.buccodev.app_finance.core.entities.Expenses;

import java.time.LocalDate;
import java.util.List;

public interface GetExpenses {

    Expenses getExpenseById(Long id);
    List<Expenses> getAllExpensesByUserId(Long id);
    List<Expenses> getAllExpensesByUserEmail(String email);
    List<Expenses> getAllExpensesPaidByUserId(Long id);
    List<Expenses> getAllExpensesNotPaidByUserId(Long id);
    List<Expenses> getAllExpenseByTermPayment(LocalDate termPayment);
}
