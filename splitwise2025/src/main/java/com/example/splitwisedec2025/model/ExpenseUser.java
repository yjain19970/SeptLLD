package com.example.splitwisedec2025.model;

public class ExpenseUser extends BaseModel {
    private Expense expense;
    private User user;
    private double amount;
    private ExpenseUserType expenseUserType;
    
    public Expense getExpense() {
        return expense;
    }
    public void setExpense(Expense expense) {
        this.expense = expense;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public ExpenseUserType getExpenseUserType() {
        return expenseUserType;
    }
    public void setExpenseUserType(ExpenseUserType expenseUserType) {
        this.expenseUserType = expenseUserType;
    }
    

}
