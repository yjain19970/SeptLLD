package com.example.sept.designpatterns.observerDP.subscribers;

import com.example.sept.designpatterns.observerDP.OrderPlacedInput;
import com.example.sept.designpatterns.observerDP.OrderPlacedSubscriber;

public class DeliveryOptionsSubscriber implements OrderPlacedSubscriber {

    @Override
    public void onOrderPlaced(OrderPlacedInput orderPlacedInput) {
        if(orderPlacedInput.orderType.equals("PRIME")){
            return;
        }

        System.out.println("Executing DeliveryOptionsSubscriber for normal order....");
    }
    
}
