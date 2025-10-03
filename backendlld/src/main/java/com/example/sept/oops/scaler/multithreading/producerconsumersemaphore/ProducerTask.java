package com.example.sept.oops.scaler.multithreading.producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class ProducerTask implements Runnable {
    private Queue<Object> q; // store
    private int maxSize; // maxSize of store
    private Semaphore producerSemaphore;  // acq
    private Semaphore consumerSemaphore; // release
    private String name;

    public ProducerTask(Queue<Object> q, int maxSize, Semaphore producerSemaphore, Semaphore consumerSemaphore, String name) {
        this.q = q;
        this.maxSize = maxSize;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
        this.name = name;
    }

    /**
     DOES PRODUCER NEED TO KNOW ABOUT THE QUEUE? --> Yes.
     Pass it via constructor
     */
    @Override
    public void run() {
        /**
         * S1. Take the lock
         * S2. code critical section
         * S3. Release lock
         */
        while(true){
            //S1. taking lock....
            try {
                producerSemaphore.acquire(); // DECREASE THE COUNT OF PROD.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //S2.
            if(q.size() < maxSize){
                System.out.println("Adding element, task-name" + name);
                q.add(new Object());
            }

            //S3.
            consumerSemaphore.release(); // INCREASE THE COUNT FOR CONSUMER.
        }
    }
}
