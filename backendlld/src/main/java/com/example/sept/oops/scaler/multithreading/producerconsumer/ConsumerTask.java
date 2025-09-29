package com.example.sept.oops.scaler.multithreading.producerconsumer;

import java.util.Queue;

public class ConsumerTask implements Runnable {
   private Queue<Object> q;
    private int maxSize;
    private String name;

    public ConsumerTask(Queue<Object> q, int maxSize, String name) {
        this.q = q;
        this.maxSize = maxSize;
        this.name = name;
    }

    // P1 --> P2 -- > C1
    @Override
    public void run() {
        while(true){
            synchronized (this.q){
                if(this.q.size() >0){
                    System.out.println("Name of the task:" + name + " before remove form the queue, size"+ q.size());
                    this.q.remove(); // when am trying to remove.. it gives me
                }
            }
        }
    } 
}
