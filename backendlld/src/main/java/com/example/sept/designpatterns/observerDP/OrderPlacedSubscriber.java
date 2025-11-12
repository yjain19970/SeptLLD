package com.example.sept.designpatterns.observerDP;

public interface OrderPlacedSubscriber {
    
    void onOrderPlaced(OrderPlacedInput orderPlacedInput);
}
