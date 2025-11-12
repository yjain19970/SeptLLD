package com.example.sept.designpatterns.observerDP;

import com.example.sept.designpatterns.observerDP.subscribers.DeliveryOptionsSubscriber;
import com.example.sept.designpatterns.observerDP.subscribers.NotifyCustomerSubscriber;
import com.example.sept.designpatterns.observerDP.subscribers.NotifySellerSubscriber;

public class Client {
    public static void main(String[] args) {
        // Bean Injection. 
        NotifySellerSubscriber orderPlacedSubscriber =  new NotifySellerSubscriber();
        DeliveryOptionsSubscriber deliveryOptionsSubscriber = new DeliveryOptionsSubscriber();
        NotifyCustomerSubscriber notifyCustomerSubscriber = new NotifyCustomerSubscriber();
        Amazon amazon = new Amazon();
        amazon.registerOrderPlacedSubscriber(orderPlacedSubscriber);
        amazon.registerOrderPlacedSubscriber(deliveryOptionsSubscriber);
        amazon.registerOrderPlacedSubscriber(notifyCustomerSubscriber);


        amazon.triggerOrderPlacedSubscribers(new OrderPlacedInput("NORMAL"));
    }
}
