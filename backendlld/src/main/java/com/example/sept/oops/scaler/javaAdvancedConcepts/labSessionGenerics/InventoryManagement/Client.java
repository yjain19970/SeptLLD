package com.example.sept.oops.scaler.javaAdvancedConcepts.labSessionGenerics.InventoryManagement;

public class Client {
    public static void main(String[] args) {
        // ONLY 1 time
        OrderProcessor orderProcessor = new OrderProcessor();
        
        
        // AS MANY ORDERS THAT YOU WANT....
        Order order = new Order("null", false);

        orderProcessor.addOrder(order);
        orderProcessor.addOrder(order);
    }
}
