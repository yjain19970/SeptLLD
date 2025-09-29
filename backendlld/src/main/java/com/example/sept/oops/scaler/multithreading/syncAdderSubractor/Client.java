package com.example.sept.oops.scaler.multithreading.syncAdderSubractor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 
 * PROBLEM STATEMENT:
 * We need to have two operations being done in parallel on a count variable.
 * Op-1 : Add values from 1-1000000
 * Op-2 : Sub valuesa from 1-1000000 
 * 
 * These should be done parallely and on the same count variable.
 * The initial value of count=0.
 * 
 * 
 * COUNT=0
 * 1
 * 2
 * 3
 * 
 * 
 * 3-1=2
 * 2-1=1
 * 1-1=0
 * 
 * 
 * 
 * Expected value of count : 0
 * 
 * 
 * 
 * 
 * 
 */
public class Client {
       public static void main(String[] args) throws InterruptedException {
        Count c = new Count(); // shared var

        Adder adder = new Adder(c);
        Subractor subractor = new Subractor(c);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subractor);

        t1.start();
        t2.start();

        // till here code was MUX.

        t1.join();
        t2.join();
        // they will wait till completion of t1 and t2.

        System.out.println("Value is:  " + c.getValue());


    } 
}


/**
 * 
 * 
 * i = i+1; 
 * 
 * 
 * S1: Read(i)
 * S2: Add 1 to i
 * S3: Update the value of (i)
 * 
 * 
 * 
 * `synchronised` block -- VERY JAVA SPECIFIC THING.
 * 
 * 
 */
