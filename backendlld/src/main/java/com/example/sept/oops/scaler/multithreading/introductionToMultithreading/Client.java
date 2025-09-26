package com.example.sept.oops.scaler.multithreading.introductionToMultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        // Print HW using a new thread.
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        
        System.out.println("In main function, default thread: "+
            Thread.currentThread().getName());
        
        //Thread t = new Thread(helloWorldPrinter); // Here we have created new thread.
        //t.start();
        //System.out.println("Hello from main/./..");


        // BAD WAY OF CREATING THREADS....
        // for(int i=1;i<=10;i++){
        //     NumberPrinterTask numberPrinterTask = 
        //         new NumberPrinterTask(i);
        //     Thread t = new Thread(numberPrinterTask);
        //     t.start();
        // }

        // GOOD WAY: (PRODUCTION WAY)
        // EXECUTORSERVICE --> Before the next class. 
        ExecutorService executorService = Executors.newCachedThreadPool();
        // MAX THREAD: 10
        for(int i=1;i<=100;i++){
            executorService.submit(new NumberPrinterTask(i));
        }

        // Fixed number of threads....

    }


    // I want to print numbers from 1-100 each in a new thread.

}
