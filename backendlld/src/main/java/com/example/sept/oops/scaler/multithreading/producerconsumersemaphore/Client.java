package com.example.sept.oops.scaler.multithreading.producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class Client {
        public static void main(String[] args) {
        Queue<Object> objects = new ConcurrentLinkedDeque<>();
        // GO TO PRODUCER AND CONSUMER AND WRITE THEIR CODE.

        Semaphore producerSemaphore = new Semaphore(5); // initial value
        Semaphore consumerSemaphore = new Semaphore(0);

        // CREATE 3 producers.
        // PASS NAMES OF PRODUCER AND CONSUMER & THEN RUN...
        ProducerTask p1 = new ProducerTask(objects, 6, producerSemaphore, consumerSemaphore, "p1");
        ProducerTask p2 = new ProducerTask(objects, 6, producerSemaphore, consumerSemaphore, "p2");
        ProducerTask p3 = new ProducerTask(objects, 6, producerSemaphore, consumerSemaphore, "p3");

        ConsumerTask c1 = new ConsumerTask(objects,6, producerSemaphore, consumerSemaphore, "c1");
        ConsumerTask c2 = new ConsumerTask(objects,6, producerSemaphore, consumerSemaphore, "c2");
        ConsumerTask c3 = new ConsumerTask(objects,6, producerSemaphore, consumerSemaphore, "c3");
        ConsumerTask c4 = new ConsumerTask(objects,6, producerSemaphore, consumerSemaphore, "c4");
        ConsumerTask c5 = new ConsumerTask(objects,6, producerSemaphore, consumerSemaphore, "c5");

        // STARTING ALL THE PRODUCERS.
        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();

        // STARTING ALL THE CONSUMERS.
        Thread t4 = new Thread(c1);
        t4.start();
        Thread t5 = new Thread(c2);
        t5.start();
        Thread t6 = new Thread(c3);
        t6.start();
        Thread t7 = new Thread(c4);
        t7.start();
        Thread t8 = new Thread(c5);
        t8.start();

    }
}
