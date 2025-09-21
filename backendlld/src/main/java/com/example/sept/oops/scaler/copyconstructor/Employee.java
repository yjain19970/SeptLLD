package com.example.sept.oops.scaler.copyconstructor;

import java.util.List;

import com.example.sept.oops.scaler.Student;

public class Employee {
    private String name;
    private int age;
    private Student student;
    private List<String> lists;

    // shallow copy
    public Employee(String name, int age){
        this.name = name; // deep copy? 
        this.age = age;
    }

    // deep copy.
    public Employee(String name){
        this.name = new StringBuilder().append(name).toString();
    }

    public Employee(Employee old){
        this.age = old.age;
        this.name = old.name;
    }

}
