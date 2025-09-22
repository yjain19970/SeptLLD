package com.example.sept.oops.labsession1.m1;

import com.example.sept.oops.labsession1.m2.Book;

public class Librarian extends User {
    private String employeeNumber;

    // Constructors
    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Employee Number: " + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    // Specific behaviours for Librarian. 
    public void addNewBook(Book book) {
        System.out.println("Librarian Adding a book");
        // Implementation for adding a book
    }

    public void removeBook(Book book) {
        System.out.println("Librarian Removing a book");
        // Implementation for removing a book
    }
}
