package com.example.sept.oops.scaler.multithreading.producerconsumer;

import java.util.Queue;

public class ProducerTask implements Runnable {
    private Queue<Object> q; // store
    private int maxSize; // size of the store.
    private String name; // thread name.

    public ProducerTask(Queue<Object> q, int maxSize, String name) {
        this.q = q;
        this.maxSize = maxSize;
        this.name = name;
    }

    @Override
    public void run() {
        while(true){
            synchronized (this.q){
                if(this.q.size() < maxSize){
                    System.out.println("Name of the task:" + name + " adding inside the queue, before size"+ q.size());
                    this.q.add(new Object());
                }
            }
        }
    }
}
