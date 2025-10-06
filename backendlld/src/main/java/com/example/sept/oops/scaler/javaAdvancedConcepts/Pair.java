package com.example.sept.oops.scaler.javaAdvancedConcepts;

// T is the dataType of the class.
public class Pair<T,V> {
   //  public static T someVariable ;  // NOT ALLOWED> 




    public T first;
    public V second;

    // Generic method.
    public T getFirst(){
        return first;
    }

    // Generic method.
    public V getSecond(){
        return second;
    }


    /*
     * 
     * For this specific static method, you create a generic variable representation,
     * IS ONLY LIMITED TO THIS METHOD.
     */
    public static <T, F> String doSomething(T someVar, F anotherArg){
        System.out.println("Printing the iNput: " + someVar);
        //return someVar;
        return "something....";
    } 


}

// Pair<String,String> pair = new Pair();
// Pair<Integer, Integer> p2 = new Pair();

// Pair<Integer,String> p4 = new Pair();
