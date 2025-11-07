package com.example.sept.designpatterns.adapterDP;

/**
 * Owner of this interface: PhonePe
 */
public interface BankAPI {
    void getBalanceForUser(String userId);

    void refreshBalance(String userId, double amount);
}
