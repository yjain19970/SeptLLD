package com.example.sept.oops.scaler.javaAdvancedConcepts.exceptionhandling;

// UnChecked exception in Java.
public class DuplicationItemException extends RuntimeException {
    public DuplicationItemException(String message){
        super(message);
    }
}
