package com.buccodev.app_finance.application.usecases.revenues_usecases;

import com.buccodev.app_finance.core.entities.Revenues;

import java.time.LocalDate;
import java.util.List;

public interface GetRevenues {

    Revenues getRevenuesById(Long id);
    List<Revenues> getAllRevenuesByUserId(Long id);
    List<Revenues> getAllRevenuesByUserEmail(Long id);
    List<Revenues> getAllRevenuesByReceiptDate(LocalDate dateReceipt);
}

