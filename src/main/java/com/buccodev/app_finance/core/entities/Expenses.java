package com.buccodev.app_finance.core.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Expenses {

    private Long id;
    private String destinationExpense;
    private LocalDate termPayment;
    private BigDecimal amount;
    private Boolean isPaid;
    private Category category;

    public Expenses(Long id, String destinationExpense, LocalDate termPayment, BigDecimal amount, Boolean paid, Category category) {
        this.id = id;
        this.destinationExpense = destinationExpense;
        this.termPayment = termPayment;
        this.amount = amount;
        this.isPaid = paid;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestinationExpense() {
        return destinationExpense;
    }

    public void setDestinationExpense(String destinationExpense) {
        this.destinationExpense = destinationExpense;
    }

    public LocalDate getTermPayment() {
        return termPayment;
    }

    public void setTermPayment(LocalDate termPayment) {
        this.termPayment = termPayment;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        this.isPaid = paid;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Expenses expenses = (Expenses) o;
        return Objects.equals(id, expenses.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
