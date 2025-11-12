package com.example.sept.designpatterns.observerDP;

import java.util.ArrayList;
import java.util.List;

/**
 * Act as a publisher.
 */
public class Amazon {
    List<OrderPlacedSubscriber> subscribers; 

    public Amazon(){
        this.subscribers = new ArrayList<>();
    }

    public void registerOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        this.subscribers.add(orderPlacedSubscriber);
    }

    public void deRegisterOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        this.subscribers.remove(orderPlacedSubscriber);
    }

    public void triggerOrderPlacedSubscribers(OrderPlacedInput input){
        for(OrderPlacedSubscriber subscriber : subscribers){
            System.out.println("Calling Another Subscriber...");
            subscriber.onOrderPlaced(input);
        }
    }

}
