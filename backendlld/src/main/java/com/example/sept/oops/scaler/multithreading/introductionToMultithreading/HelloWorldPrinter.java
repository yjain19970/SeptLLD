package com.example.sept.oops.scaler.multithreading.introductionToMultithreading;

public class HelloWorldPrinter implements Runnable {

    @Override
    public void run() {
        printHW();
    }

    private void printHW() {
        System.out.println("Hello world , name: " + 
        Thread.currentThread().getName());
    }
}
