package com.example.sept.oops.scaler.javaAdvancedConcepts.labSessionGenerics.comparator;

public class Person {
    String name;
    int age;
    double weight;

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", weight=" + weight + " kgs]";
    }
}

