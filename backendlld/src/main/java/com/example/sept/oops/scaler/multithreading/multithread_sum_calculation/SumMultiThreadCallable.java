package com.example.sept.oops.scaler.multithreading.multithread_sum_calculation;

import java.util.List;
import java.util.concurrent.Callable;

public class SumMultiThreadCallable implements Callable<Long> {
    List<Integer> arr;
    Integer start, end;
    // 0-249
    // 250-499
    // 500- 749
    // 750-999


    public SumMultiThreadCallable(List<Integer> arr, Integer start, Integer end){
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() throws Exception {
        System.out.println("Thread is: " + Thread.currentThread().getName());
        Long sum = 0L;
        for(int i = start; i < end; i++) {
            sum += arr.get(i);
        }
        return sum;
    }
}
