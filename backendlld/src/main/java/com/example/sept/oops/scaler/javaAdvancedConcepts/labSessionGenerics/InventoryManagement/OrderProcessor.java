package com.example.sept.oops.scaler.javaAdvancedConcepts.labSessionGenerics.InventoryManagement;

import java.util.PriorityQueue;
import java.util.Queue;

public class OrderProcessor {
    private Queue<Order> orders;

    public Queue<Order> getOrders() {
        return orders;
    }
    public void setOrders(Queue<Order> orders) {
        this.orders = orders;
    }
    public OrderProcessor() {
        this.orders = new PriorityQueue<>();
        // This orders Q is a priorityQueue.
    }

    // DEFINED METHODS BELOW:::
    public void addOrder(Order order){
        orders.offer(order); // ADDING ORDER
    }
    
    public void processOrder(Order o){
        orders.poll();
    }

    public int sizeOfOrder(){
        return orders.size();
    }
    
    
}
