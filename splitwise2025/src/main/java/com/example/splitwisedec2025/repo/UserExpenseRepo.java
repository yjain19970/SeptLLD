package com.example.splitwisedec2025.repo;

import java.util.List;
import java.util.Map;

import com.example.splitwisedec2025.model.ExpenseUser;

public class UserExpenseRepo {
     private Map<Long, ExpenseUser> expenseRepo;
    private static Long lastId = 1L;

    public UserExpenseRepo(Map<Long, ExpenseUser> expenseRepo) {
        this.expenseRepo = expenseRepo;
    }

    


    public ExpenseUser saveExpense(ExpenseUser expense){
        if(expenseRepo.get(lastId) ==null){
            expenseRepo.put(lastId, expense);
        }
        ExpenseUser createdExpense = expenseRepo.get(lastId); 
        lastId++;
        return createdExpense;
    }


    public ExpenseUser getExpenseUser(long id){
        if(expenseRepo.get(id) ==null){
            throw new IllegalStateException();
        }
        return expenseRepo.get(id);
    }

    public List<ExpenseUser> getExpenseUserByUserId(long userId){
        List<ExpenseUser> expenses =  expenseRepo.values().stream()
                                                .filter(expensUser -> expensUser.getUser().getId()
                                                            .equals(userId)).toList();
        return expenses;
    }    
}
