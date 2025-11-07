package com.example.sept.designpatterns.adapterDP;

public class PhonePe {
    BankAPI bankAPI;
    
    public PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    public void getBalance(String userId){
        bankAPI.getBalanceForUser(userId);
    }

    public void updateBalance(String userId, Double amount){
        bankAPI.refreshBalance(userId, amount);
    }
}
