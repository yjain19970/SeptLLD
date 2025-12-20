package com.example.splitwisedec2025.repo;

import java.util.Map;

import com.example.splitwisedec2025.model.Expense;

public class ExpenseRepo {
    private Map<Long, Expense> expenseRepo;
    private static Long lastId = 1L;

    public ExpenseRepo(Map<Long, Expense> expenseRepo) {
        this.expenseRepo = expenseRepo;
    }

    


    public Expense saveExpense(Expense expense){
        if(expenseRepo.get(lastId) ==null){
            expenseRepo.put(lastId, expense);
        }
        Expense createdExpense = expenseRepo.get(lastId); 
        lastId++;
        return createdExpense;
    }


    public Expense getExpense(long id){
        if(expenseRepo.get(id) ==null){
            throw new IllegalStateException();
        }
        return expenseRepo.get(id);
    }
     
}
