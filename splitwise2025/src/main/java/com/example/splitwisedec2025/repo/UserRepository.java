package com.example.splitwisedec2025.repo;

import java.util.Map;

import com.example.splitwisedec2025.model.User;

public class UserRepository {
    private Map<Long, User> userRepoMap;
    private static Long lastId = 1L;

    public UserRepository(Map<Long, User> expenseRepo) {
        this.userRepoMap = expenseRepo;
    }

    


    public User saveExpense(User expense){
        if(userRepoMap.get(lastId) ==null){
            userRepoMap.put(lastId, expense);
        }
        User createdExpense = userRepoMap.get(lastId); 
        lastId++;
        return createdExpense;
    }


    public User getUser(long id){
        if(userRepoMap.get(id) ==null){
            throw new IllegalStateException();
        }
        return userRepoMap.get(id);
    }
}
