package com.buccodev.app_finance.core;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Expenses {

    private Long id;
    private String destinationExpense;
    private LocalDate termPayment;
    private BigDecimal amount;
    private Boolean paid;
    private Category category;

}
