package com.buccodev.app_finance.core;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Revenues {

    private Long id;
    private String origin;
    private LocalDate receipt;
    private BigDecimal amount;
    private Category category;

    public Revenues(Long id, String origin, LocalDate receipt, BigDecimal amount, Category category) {
        this.id = id;
        this.origin = origin;
        this.receipt = receipt;
        this.amount = amount;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public LocalDate getReceipt() {
        return receipt;
    }

    public void setReceipt(LocalDate receipt) {
        this.receipt = receipt;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
        Revenues revenues = (Revenues) o;
        return Objects.equals(id, revenues.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
