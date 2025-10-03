package com.example.sept.oops.scaler.multithreading.producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class ConsumerTask implements Runnable {
   private Queue<Object> q;
    private int maxSize;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;
    private String name;

    public ConsumerTask(Queue<Object> q, int maxSize, Semaphore producerSemaphore, Semaphore consumerSemaphore, String name) {
        this.q = q;
        this.maxSize = maxSize;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
        this.name = name;
    }


    @Override
    public void run() {
        while(true){
            //S1.
            System.out.println("Outside critical section....");
            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //S2. Code critical section
            if(q.size() > 0){
                System.out.println("Removing element, task-name" + name);
                q.remove();
            }

            //S3. release
            producerSemaphore.release(); // INCREAMENT THE COUNT ON PRODUCER. -- 5?? 
            System.out.println("Outside critical section....");
        }
    } 
}
