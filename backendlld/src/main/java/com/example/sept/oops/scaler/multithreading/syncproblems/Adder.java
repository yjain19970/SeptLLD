package com.example.sept.oops.scaler.multithreading.syncproblems;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    private Count count;
    private Lock lock;

    public Adder(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for (int i = 1; i < 100000000; i++) {
            this.count.incrementValue(i);
        }
        lock.unlock();
    }

}
