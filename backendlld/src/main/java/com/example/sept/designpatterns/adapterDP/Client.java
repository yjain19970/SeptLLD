package com.example.sept.designpatterns.adapterDP;

import java.util.Random;

import com.example.sept.designpatterns.adapterDP.adapter.HdfcBankAdapter;
import com.example.sept.designpatterns.adapterDP.adapter.YesBankAdapter;

public class Client {
    public static void main(String[] args) {
        /**
         * Make a change in the code, 
         * so that 50% of times I get YesBankAPI Adapter.
         * Rest I get HDFCBankApi Adapter.
         */
        BankAPI bankAPI = getBankAPIInstance();
        //BankAPI hdfcApi = new YesBankAdapter(new YesBank()); // Beans in Spring.
        PhonePe pe = new PhonePe(bankAPI);
        pe.getBalance("userId1");
    }

    private static BankAPI getBankAPIInstance() {
        /**
         * Have some probability random number logic to find out... the adapter
         */
        int nextNo = new Random().nextInt(100);
        if(nextNo%2 ==0){
            return new HdfcBankAdapter(new HdfcBank());
        }
        return new YesBankAdapter(new YesBank());
    }
}
