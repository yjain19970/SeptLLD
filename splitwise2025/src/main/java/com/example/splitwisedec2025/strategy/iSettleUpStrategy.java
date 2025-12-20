package com.example.splitwisedec2025.strategy;

import java.util.List;

import com.example.splitwisedec2025.model.Expense;

public interface iSettleUpStrategy {
    List<Expense> calculateTransactions(List<Expense> expensesForUser);
}
