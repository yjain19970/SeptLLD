package com.example.sept.designpatterns.adapterDP.adapter;

import com.example.sept.designpatterns.adapterDP.BankAPI;
import com.example.sept.designpatterns.adapterDP.HdfcBank;

/**
 * Phonepe owns this class.
 */
public class HdfcBankAdapter implements BankAPI {
    private HdfcBank hdfcBank;
    

    public HdfcBankAdapter(HdfcBank hdfcBank) {
        this.hdfcBank = hdfcBank;
    }

    @Override
    public void getBalanceForUser(String userId) {
        /**
         * Can you think of using BDP here?
         * 
         */
        System.out.println("getBalanceForUser: HDFC");
        hdfcBank.fetchBalance(userId);
    }

    @Override
    public void refreshBalance(String userId, double amount) {
        System.out.println("refreshBalance: HDFC");
        hdfcBank.editBalance(userId, null);
    }
    
}
