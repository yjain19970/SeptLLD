package com.example.splitwisedec2025.dto;

public class CreateExpenseResponseDTO {
    private Long expenseId;
    private String description;


    public CreateExpenseResponseDTO(Long expenseId, String description) {
        this.expenseId = expenseId;
        this.description = description;
    }
    
    public Long getExpenseId() {
        return expenseId;
    }
    public String getDescription() {
        return description;
    }
    
    
}
