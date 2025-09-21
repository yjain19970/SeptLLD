package com.example.sept.oops.scaler.inheritance;

// instructor is child class of user
public class Instructor extends User {
    public double rating;
    
    public Instructor(double rating, String name, String pwd) {
        super(name, pwd); // This is used to call the PARENT constructor.
        // NOTE: this should be always the 1st line in the child constructor, 
        // IF you want to call parent.
        System.out.println("INSTRUCTOR...");
        this.rating = rating;
    }

        public Instructor(double rating) {
        System.out.println("INSTRUCTOR...");
        this.rating = rating;
    }

    public void displayRating(){
        System.out.println("Rating: " + rating);
    }
}
