package com.example.sept.oops.scaler.multithreading.syncMethod;

public class Count {
    private int value = 0;

    public int getValue() {
        return this.value;
    }

    // This will increament or decreament the value.
    // if you pass (-1) decreament.
    // if you pass (+1) increament.
    public synchronized void incrementValue(int offset) {
        this.value += offset;
    }

    // NOT ALLOWED.
    public synchronized void decreament(int offset) {
        this.value += offset;
    }    
}
