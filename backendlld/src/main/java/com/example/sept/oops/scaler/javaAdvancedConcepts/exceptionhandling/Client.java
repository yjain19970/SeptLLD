package com.example.sept.oops.scaler.javaAdvancedConcepts.exceptionhandling;

public class Client {
    public static void main(String[] args) {
        try{
            Client c = new Client();
            c.doDivide(10, 10);
        } catch(Exception e){
            System.out.println("Exception has happened, pls check INPUT");
            // HW: How do you create a custom exception of your OWN.
        } finally{
            // Optional thing...
            System.out.println("Finally...");
        }
            Client c = new Client();
            c.doDivide(10, 10);
        
    }

    public double doDivide(int a, int b) throws ArithmeticException {
        return a/b;
    }
}

/**
 * 
 * 
 * Exception is a class. 
 *              
 * 
 * 
 *                  OBJECT
 *                      
 *                  THROWABLE
 *          
 *          EXCEPTION                       ERROR
 *              
 *            - CategoryA:
 *              - Checked Exception
 *                  - i/o exceptions that happen... 
 *          
 *            - CategoryB:
 *                - UncheckedExceptions.
 *                      - NPE
 *                      - ArithematicException, Runtime 
 * 
 * 
 * 
 * 
 * 
 * 
 */
