package com.example.sept.oops.scaler.multithreading.callablesAndMergeSort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws Exception {
        List<Integer> list = List.of(7, 3, 4, 1, 9, 8, 2, 6);
        // S1. Create ExecutorService
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        // it will try to reuse the existing threads if possible.

        // S2. Create Task for MergeSort
        MergeSorter mergeSorter = new MergeSorter(list, executorService);
        Future<List<Integer>> result =  executorService.submit(mergeSorter);


        System.out.println("Result: " + result.get());

        // S3. Passing the Task to ExecutorService
        //Future<List<Integer>> sortedListFuture = executorService.submit(mergeSorter);

        // S4. from future, untill you do `get()` you will not get data.
        // If thread is still WIP, then this will wait -- BLOCKING call.
        //List<Integer> sortedList = sortedListFuture.get();

        //System.out.println(sortedList);
        // S5. once work is done, shutdown the executor service
        //executorService.shutdown();
    }
}
