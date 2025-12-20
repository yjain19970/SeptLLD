package com.example.splitwisedec2025.service;

import java.util.ArrayList;
import java.util.List;

import com.example.splitwisedec2025.model.Expense;
import com.example.splitwisedec2025.model.ExpenseUser;
import com.example.splitwisedec2025.model.User;
import com.example.splitwisedec2025.repo.ExpenseRepo;
import com.example.splitwisedec2025.repo.UserExpenseRepo;
import com.example.splitwisedec2025.repo.UserRepository;
import com.example.splitwisedec2025.strategy.MinMaxHeapSettleUpStrategy;
import com.example.splitwisedec2025.strategy.iSettleUpStrategy;

public class SettleUpServiceImpl {
    private ExpenseRepo expenseRepo;
    private UserRepository userRepo;
    private UserExpenseRepo userExpenseRepo;
    private iSettleUpStrategy iSettleUpStrategy;
    

    public SettleUpServiceImpl(ExpenseRepo expenseRepo, UserRepository userRepo, UserExpenseRepo userExpenseRepo) {
        this.expenseRepo = expenseRepo;
        this.userRepo = userRepo;
        this.userExpenseRepo = userExpenseRepo;
        this.iSettleUpStrategy = new MinMaxHeapSettleUpStrategy();
    }


    public List<Expense> settleUpUser(Long userId) {
        /*
            S1. find the user by userId
            S2. Find the List<UserExpense> for that userId
            S3. Then get the strategy -- HeapAlgorithm OR BruteForceWay
            S4. Finally Return the List<ExpenseTransaction>
        */
        User user = userRepo.getUser(userId);
        if(user == null){
            // Throw an Exception from here....
        }

        List<ExpenseUser> expenseUsers =  userExpenseRepo.getExpenseUserByUserId(userId);
        List<Expense> expenses = new ArrayList<>();
        for(ExpenseUser expenseUser : expenseUsers){
            expenses.add(expenseUser.getExpense());
        }
        // Finally we will have to call the strategy.
        return iSettleUpStrategy.calculateTransactions(expenses);
    }
    
}
