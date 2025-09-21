package com.example.sept.oops.scaler.polymorphism;

public class Parent {
    public int parentAge;

    void doSomething(){
        System.out.println("Parent says Hello");
    }

    // This is a parent method only!!!
    void doSomething(int x){
        System.out.println("Passed value: " + x);
    }

    void sleepParent(){
        System.out.println("sleep parent...");
    }
}
