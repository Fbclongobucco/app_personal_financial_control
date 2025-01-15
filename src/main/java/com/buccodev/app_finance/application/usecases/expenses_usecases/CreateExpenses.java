package com.buccodev.app_finance.application.usecases.expenses_usecases;

import com.buccodev.app_finance.core.entities.Expenses;

public interface CreateExpenses {

    void saveExpenses(Expenses expenses);
}
