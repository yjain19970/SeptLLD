package com.example.sept.oops.scaler.multithreading.syncAdderSubractor;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    private Count count;

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
