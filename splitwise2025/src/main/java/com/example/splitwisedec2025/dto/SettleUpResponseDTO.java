package com.example.splitwisedec2025.dto;

import java.util.List;

public class SettleUpResponseDTO {
    private List<ExpenseTransactionDTO> expensesToMake;

    public List<ExpenseTransactionDTO> getExpensesToMake() {
        return expensesToMake;
    }

    public void setExpensesToMake(List<ExpenseTransactionDTO> expensesToMake) {
        this.expensesToMake = expensesToMake;
    }
    
}
