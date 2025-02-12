package com.buccodev.app_finance.core.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Category {

    private Long id;
    private String name;
    private final List<Revenues> revenuesList = new ArrayList<>();
    private final List<Expenses> expensesList = new ArrayList<>();

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Revenues> getRevenuesList() {
        return revenuesList;
    }

    public List<Expenses> getExpensesList() {
        return expensesList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
