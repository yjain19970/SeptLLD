package com.example.sept.oops;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    double balance;
    String name;
    List<Transaction> transactions;

    public BankAccount(){
        this.name = "Some Name";
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public BankAccount(String name, double balance, List<Transaction> transactions){
        this.name = name;
        this.balance = balance;
        this.transactions = transactions;
    }

    void deposit(double amount){
        balance +=amount;
        System.out.println("Amount deposited: " + amount);
    }

    void withdraw(double amountToWithdraw){
        if(balance < amountToWithdraw){
            System.out.println("Insufficient balance");
        }else{
            balance -= amountToWithdraw;
            System.out.println("Successful!");
        }
    }

    void showBalance(){
        System.out.println("Current balance: " + balance);
    }


    public static void main(String[] args){
        System.out.println("Starting the code....");
        BankAccount bankAccountForYash = new BankAccount();
        bankAccountForYash.showBalance();
        // Update
        bankAccountForYash.balance = 1000.00;
        bankAccountForYash.name = "Yash";

        bankAccountForYash.showBalance();

        // Credit
        bankAccountForYash.deposit(150.00);
        
        // Show
        bankAccountForYash.showBalance();
        
    }
}
