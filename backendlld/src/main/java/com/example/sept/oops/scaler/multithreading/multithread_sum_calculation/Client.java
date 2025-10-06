package com.example.sept.oops.scaler.multithreading.multithread_sum_calculation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        int size = 100;
        int availableCores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available core: " + availableCores);

        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for(int i=0;i<size;i++){
            numbers.add(random.nextInt(1000)); // 
        }
        int chunkSize = size / availableCores; // 1000/12 = 
        ExecutorService executorService = Executors.newFixedThreadPool(availableCores); // 4 threads.

        List<Future<Long>> futures = new ArrayList<>();
        for(int i=0;i<availableCores;i++){
            int start = i*chunkSize; // i=0 start =0
            int end = (i == availableCores-1) ? size : (i+1)*chunkSize; // end = 

            Callable<Long> task = new SumMultiThreadCallable(numbers, start, end);
            // Task creation.
            Future<Long> sum = executorService.submit(task); 
            futures.add(sum);
        }

        // ITERATE OVER MY FUTURES AND GET THE SUM.
        long sum=0;
        for(int i=0;i<futures.size();i++){
            sum += futures.get(i).get();
        }

        executorService.shutdown();
        System.out.println("Sum is: " + sum);
    }
}

/**
 * 
 * Problem Statement
    Implement a BankAccount class with a balance.
    Create multiple threads representing depositors and withdrawers.
    Simulate a race condition where multiple users deposit and withdraw simultaneously.
    Fix the issue using:
        synchronized methods
        synchronized blocks
    Measure execution time with and without synchronization.
 * 
 * 
 * 
 */