package com.example.sept.oops.scaler.multithreading.syncMethod;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    private Count count;
    private Count count2;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        synchronized(count){
            for (int i = 1; i < 100000000; i++) {
                this.count.incrementValue(i);
            }
        }
    }

}
