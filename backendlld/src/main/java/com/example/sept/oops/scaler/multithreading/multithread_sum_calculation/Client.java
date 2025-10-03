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
        int dataSize = 1000;
        int availableCores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available Cores: " + availableCores);

        // Generate random numbers
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < dataSize; i++) {
            numbers.add(random.nextInt(10000));
        }

        // Executor with N threads
        ExecutorService executor = Executors.newFixedThreadPool(availableCores);

        // Prepare tasks
        List<Future<Long>> futures = new ArrayList<>();
        int chunkSize = dataSize / availableCores; // Dividing datasize to process in each availableCore. 

        for (int i = 0; i < availableCores; i++) {
            int start = i * chunkSize;
            int end = (i == availableCores - 1) ? dataSize : (i + 1) * chunkSize;

            Callable<Long> task = new SumMultiThreadCallable(numbers, start, end);
            futures.add(executor.submit(task));
        }

        // Collect results
        long totalSum = 0;
        for (Future<Long> f : futures) {
            totalSum += f.get(); // waits for each thread to finish and adds its sum
        }
        executor.shutdown();
        System.out.println("Total sum = " + totalSum);
    }
}
