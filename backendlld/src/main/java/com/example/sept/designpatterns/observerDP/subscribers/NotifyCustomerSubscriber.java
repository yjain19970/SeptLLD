package com.example.sept.designpatterns.observerDP.subscribers;

import com.example.sept.designpatterns.observerDP.OrderPlacedInput;
import com.example.sept.designpatterns.observerDP.OrderPlacedSubscriber;

public class NotifyCustomerSubscriber implements OrderPlacedSubscriber {

    @Override
    public void onOrderPlaced(OrderPlacedInput orderPlacedInput) {
        executeOrderPlaced(orderPlacedInput);
    }

    public void executeOrderPlaced(OrderPlacedInput orderPlacedInput){
        System.out.println("Executing NotifyCustomerSubscriber..");
    }
    
}
