package com.example.sept.designpatterns.prototypeAndRegistry;

public interface Prototype<T> {
    
    /**
     * This method implementation will return you a new 
     * object of T given with original details.
     * @return
     */
    T clone();
}
