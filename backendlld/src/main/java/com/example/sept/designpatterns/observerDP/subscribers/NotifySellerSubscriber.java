package com.example.sept.designpatterns.observerDP.subscribers;

import com.example.sept.designpatterns.observerDP.OrderPlacedInput;
import com.example.sept.designpatterns.observerDP.OrderPlacedSubscriber;

public class NotifySellerSubscriber implements OrderPlacedSubscriber {

    @Override
    public void onOrderPlaced(OrderPlacedInput orderPlacedInput) {
        System.out.println("executing.. NotifySellerSubscriber");
    }
    
}
