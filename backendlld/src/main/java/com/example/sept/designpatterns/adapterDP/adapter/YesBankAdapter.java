package com.example.sept.designpatterns.adapterDP.adapter;

import com.example.sept.designpatterns.adapterDP.BankAPI;
import com.example.sept.designpatterns.adapterDP.YesBank;

/**
 *   Phonepe owns this class.
 */
public class YesBankAdapter implements BankAPI {
    private YesBank yesBank;
    

    public YesBankAdapter(YesBank yesBank) {
        this.yesBank = yesBank;
    }

    @Override
    public void getBalanceForUser(String userId) {
        System.out.println("getBalanceForUser: Yes bank");
        yesBank.fetchBalance(userId);
    }

    @Override
    public void refreshBalance(String userId, double amount) {
         System.out.println("refreshBalance: Yes bank");
         yesBank.updateBalanceForUser(userId, amount);
    }
    
}
