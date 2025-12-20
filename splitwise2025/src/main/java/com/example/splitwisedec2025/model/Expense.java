package com.example.splitwisedec2025.model;

import java.util.List;

public class Expense extends BaseModel {
    private String description;
    private double totalAmount;

    /**
     *  Expense <> User  [CreatedBy]
     *  1 -------> 1
     *  M <-------- 1
     * ------------------ M:1
     */
    private User createdBy;
    // ENUM
    private ExpenseType expenseType;

    private Group group;
    /*
        1:M
    */
    private List<ExpenseUser> expenseUsers;

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public User getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }
    public ExpenseType getExpenseType() {
        return expenseType;
    }
    public void setExpenseType(ExpenseType expenseType) {
        this.expenseType = expenseType;
    }
    public Group getGroup() {
        return group;
    }
    public void setGroup(Group group) {
        this.group = group;
    }
    public List<ExpenseUser> getExpenseUsers() {
        return expenseUsers;
    }
    public void setExpenseUsers(List<ExpenseUser> expenseUsers) {
        this.expenseUsers = expenseUsers;
    }
    
}
