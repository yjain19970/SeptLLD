package com.example.sept.oops.scaler.javaAdvancedConcepts.labSessionGenerics.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<PersonV2> people = new ArrayList<>(Arrays.asList(
                new PersonV2("Alice", 30, 65.5),
                new PersonV2("Bob", 25, 75.0),
                new PersonV2("Charlie", 35, 80.0)
        ));
        System.out.println("Original people list: " + people);

        Collections.sort(people);
        System.out.println("Sorted people list: " + people);
    }    
}
