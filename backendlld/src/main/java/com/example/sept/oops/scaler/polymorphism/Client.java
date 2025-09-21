package com.example.sept.oops.scaler.polymorphism;

public class Client {
    /**
     * Demo for Parent-Child method overriding. (Runtime Polymorphism)
     * @param args
     */
    public static void main(String[] args) {
        Parent p = new Child();
        p.doSomething();  // CHILD METHOD. 
        p.doSomething(3); // PARENT METHOD.

        Child c = new Child();
        c.sleepChild();;

    }

    public static void login(Parent p){
        System.out.println("user is logged-in");
    }



    /**
     * 
     * 
     * TWO TYPES OF POLYMORPHISM
     * 
     * 1. OVERLOADING(COMPILE TIME POLYM)
     * 2. OVERRIDING (RUN TIME POLYMORPHISM)
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     */
}
