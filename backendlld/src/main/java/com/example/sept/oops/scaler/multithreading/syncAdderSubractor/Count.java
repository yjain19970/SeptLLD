package com.example.sept.oops.scaler.multithreading.syncAdderSubractor;

public class Count {
    private int value = 0;

    public int getValue() {
        return this.value;
    }

    // This will increament or decreament the value.
    // if you pass (-1) decreament.
    // if you pass (+1) increament.
    public void incrementValue(int offset) {
        this.value += offset;
    }
}
