package com.example.splitwisedec2025.service;

import java.util.List;

import com.example.splitwisedec2025.model.Expense;
import com.example.splitwisedec2025.repo.ExpenseRepo;

public class ExpenseServiceImpl {
    private ExpenseRepo expenseRepo;

    public Expense createExpense(Long createdByUserId,
                              String description, 
                            String splitType,
                            double totalAmount,
                            List<Long> userIds) {
        Expense createdExpense =  expenseRepo.saveExpense(new Expense()); // ToDo: This Expense Object needs to be created correctly.
        return createdExpense;
    }
    
}
