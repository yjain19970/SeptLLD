package com.example.sept.oops.scaler.javaAdvancedConcepts.labSessionGenerics.comparable;

public class PersonV2 implements Comparable<PersonV2> {
    String name;
    int age;
    double weight;

    public PersonV2(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "PersonV2 [name=" + name + ", age=" + age + ", weight=" + weight + " kgs]";
    }

    // Forced to give implementation.
    @Override
    public int compareTo(PersonV2 other) {
        // sort by name.
        return this.age - other.age;
    }    
}

/**
 * Limitations of Comparable:
 * 
 * 1. Single Natural Ordering -- Can use only one attribute for natural sorting order.
 * 2. Inflexibility -- class modification is needed.
 */