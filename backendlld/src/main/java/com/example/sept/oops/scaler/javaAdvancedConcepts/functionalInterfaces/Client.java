package com.example.sept.oops.scaler.javaAdvancedConcepts.functionalInterfaces;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Client {
    public static void main(String[] args) {
        
        // Anonymised class ex

        Consumer<String> consumerI = new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println("hello: " + t);
            }
        };
        consumerI.accept("Yash");


        // Lambda Expressions
        for(int i=0;i<10;i++){
            Consumer<String> consumer2 = (x) -> {
                System.out.println("Hello: "+x);
            };
            consumer2.accept("Yash Jain");
            consumer2.accept("M Vikas");
            consumer2.accept("Sanjay");
        }
       

        Consumer<String> consumer3 = (x) -> {
            System.out.println("Hello: "+x);
        };
        consumer3.accept("Yash Jain");        




        // BinaryOperator.

        BinaryOperator<Integer> binaryOperator = (x,y) ->{
            return x+y;
        };
        Integer output =  binaryOperator.apply(1, 2);
        System.out.println("Output: " + output);





        // RUNNABLE.
        // () ---> INPUT
        // {} ---> METHOD BODY.

        Runnable runnable = () -> {
            System.out.println("New Thread: " +
             Thread.currentThread().getName());
        };

        Thread t = new Thread(runnable);
        t.start();


        // 1 LINE OF CODE.....






        // If your line of code in the function is 1 line...
        // dont even need. {}

        Thread t2 = new Thread(()-> System.out.println("Hello world!!!"));
        t2.start();













    }
}
