package com.example.sept.oops.scaler.javaAdvancedConcepts.exceptionhandling;

// Checked Exception. (compileTime)
public class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message){
        super(message);
    }
}
