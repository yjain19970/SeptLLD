package com.example.sept.oops.scaler.javaAdvancedConcepts.labSessionGenerics.comparator;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        /**
         * whatever implemetation...
         */
        return p1.getName().compareTo(p2.getName());
    }
}