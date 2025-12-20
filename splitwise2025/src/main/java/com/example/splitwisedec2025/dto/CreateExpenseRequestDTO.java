package com.example.splitwisedec2025.dto;

import java.util.List;

public class CreateExpenseRequestDTO {
    private String description;
    private List<Long> userIds;
    private double totalAmount;
    private String splitType; // EQUAL OR RATIO BASED.. CAN BE SUPPORTED LATER.
    private Long createdByUserId;


    public CreateExpenseRequestDTO(String description, List<Long> userIds, double totalAmount, String splitType,
            Long createdByUserId) {
        this.description = description;
        this.userIds = userIds;
        this.totalAmount = totalAmount;
        this.splitType = splitType;
        this.createdByUserId = createdByUserId;
    }
    
    public String getDescription() {
        return description;
    }
    public List<Long> getUserIds() {
        return userIds;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public String getSplitType() {
        return splitType;
    }
    public Long getCreatedByUserId() {
        return createdByUserId;
    }

    

}
