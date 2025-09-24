package com.example.sept.oops.scaler.introductionToMultithreading;

public class NumberPrinterTask implements Runnable {

    private int no;

    public NumberPrinterTask(int no){
        this.no = no;
    }

    @Override
    public void run() {
        System.out.println("Number: "+no + " thread name is: "+
        Thread.currentThread().getName());
    }
    
}
