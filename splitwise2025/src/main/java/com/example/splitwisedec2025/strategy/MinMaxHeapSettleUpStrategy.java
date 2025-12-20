package com.example.splitwisedec2025.strategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import com.example.splitwisedec2025.Pair;
import com.example.splitwisedec2025.model.Expense;
import com.example.splitwisedec2025.model.ExpenseUser;
import com.example.splitwisedec2025.model.ExpenseUserType;
import com.example.splitwisedec2025.model.User;

public class MinMaxHeapSettleUpStrategy implements iSettleUpStrategy {

    /**
     * 1. Find ExpenseType ---> HadToPay v/s Paid
     * 2. Find the Negative / Positive Balance
     * 3. Iterate through Negative/Positive balance Queue and complete Individual.
     * 
     */
    @Override
    public List<Expense> calculateTransactions(List<Expense> expensesForUser) {
        Map<User,Double> userHadToPay = new HashMap<>(); /// -Ve HashMap
        Map<User,Double> userPaid = new HashMap<>(); // +HashMap

        for(Expense expense : expensesForUser){
            List<ExpenseUser> expenseUsers  = expense.getExpenseUsers();
            for(ExpenseUser expenseUser : expenseUsers){
                if(expenseUser.getExpenseUserType().equals(ExpenseUserType.HAD_TO_PAY)){
                    Double existingAmount = userHadToPay.getOrDefault(expenseUser.getUser(), 0.0);
                    userHadToPay.put(expenseUser.getUser(), existingAmount + expenseUser.getAmount());
                }else{
                    Double existingAmount = userPaid.getOrDefault(expenseUser.getUser(), 0.0);
                    userPaid.put(expenseUser.getUser(), existingAmount + expenseUser.getAmount());
                }
            }
        }

        // Creating PositiveBalance and NegativeBalance Queue
        PriorityQueue<Pair<User,Double>> negativeBalanceQueue = new PriorityQueue<>((p1,p2) -> Double.compare(p1.getValue(),p2.getValue()));
        PriorityQueue<Pair<User,Double>> positiveBalanceQueue = new PriorityQueue<>((p1,p2) -> Double.compare(p2.getValue(),p1.getValue()));
        
        for(Map.Entry<User,Double> entry: userHadToPay.entrySet()){
            negativeBalanceQueue.add(new Pair(entry.getKey(),entry.getValue()));
        }

        for(Map.Entry<User,Double> entry: userPaid.entrySet()){
            positiveBalanceQueue.add(new Pair(entry.getKey(),entry.getValue()));
        }

        List<Expense> transaExpenses = new ArrayList<>();
        while(!negativeBalanceQueue.isEmpty() || !positiveBalanceQueue.isEmpty()){
            Pair<User,Double> negativeMin = negativeBalanceQueue.poll();
            Pair<User,Double> positiveMax = positiveBalanceQueue.poll();

            if(negativeMin.getValue() < positiveMax.getValue()){
                transaExpenses.add(new Expense()); // Todo: Complete this later.  [Whatever is the lower value, should be added as AMOUNT and Type should: DUMMY]
                positiveMax = new Pair<User,Double>(positiveMax.getKey(), 
                                                    positiveMax.getValue()-negativeMin.getValue());
                positiveBalanceQueue.add(positiveMax);
            }else{
                transaExpenses.add(new Expense()); // Todo: Complete this later.  [Whatever is the lower value, should be added as AMOUNT and Type should: DUMMY]
                negativeMin = new Pair<User,Double>(negativeMin.getKey(), 
                                                    negativeMin.getValue()-positiveMax.getValue());
                negativeBalanceQueue.add(negativeMin);                
            }
        }
        return transaExpenses;
    }
    
}
