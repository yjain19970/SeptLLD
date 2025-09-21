package com.example.sept.oops.scaler.inheritance;

public class Client {
    public static void main(String[] args) {
        Instructor instructor = new Instructor(10.0, "Yash", "Pwd");
        instructor.logIn();
        instructor.logOut();
    }
}

/**
 * 
 * USER ---> INSTRUCTOR
 * 
 * 
 * CONSTRUCTOR :: INSTRUCTOR --> USER
 * 
 */

/**
 * 
 * 
 * Scaler system:
 *  Learners/Students
 *  Instructors
 *  Mentors
 * 
 * 
 * 
 * class Student{
 * 
 *  login(){
 *  }
 * }
 * 
 * 
 * class Instructor {
 * 
 *  login(){
 *  }
 * }
 * 
 * 
 * 
 * 
 */