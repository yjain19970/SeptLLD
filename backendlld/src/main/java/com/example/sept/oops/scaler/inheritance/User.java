package com.example.sept.oops.scaler.inheritance;

public class User {
    public String name;
    public String pwd;
    

    public User(){
        System.out.println("USER...");
        // NO ARG CONSTRUCTOR.
    }
    public User(String name, String pwd) {
        System.out.println("USER CONSTRUCTOR WITH PARAM...");
        this.name = name;
        this.pwd = pwd;
    }

    public User(String name) {
        this.name = name;
    }

    public void logIn(){
        System.out.println("LoggedIn!");
    }

    public void logOut(){
        System.out.println("LoggedOut!");
    }    
}
