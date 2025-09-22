package com.example.sept.oops.labsession1.m2;

import com.example.sept.oops.labsession1.m1.User;

public abstract class Book implements Lendable {
    protected String isbn;
    protected String title;
    protected String author;
    protected boolean isAvailable;
    protected BookType bookType; // THIS CAN BE ENUM.

    // Default constructor
    public Book() {
        this.isAvailable = true;
        this.bookType = BookType.COMEDY;
    }

    // Parameterized constructor
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.bookType = BookType.COMEDY; // Setting some value here.
    }

    // Copy constructor
    public Book(Book other) {
        this.isbn = other.isbn;
        this.title = other.title;
        this.author = other.author;
        this.isAvailable = other.isAvailable;
        this.bookType = other.bookType;
    }

    @Override
    public boolean lend(User user) {
        if (isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            System.out.println("This book has been lended to user: " + user.getName() + " ; Marking this book as Unavailable now.");
            return true;
        }
        System.out.println("This book is currently unavailable.");
        return false;
    }

    @Override
    public void returnBook(User user) {
        System.out.println("Marking book " + title +" as available now.");
        isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    // Abstract method
    public abstract void displayBookDetails();

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    
}

/**
 * 
 * Another solution can be:
 * 
 * 1. Have abstract book class and its child classes.
 * 2. Have Lendable interface.
 * 3. Implement Lendable interface only in those classes which can lend the books.
 *      - Problem: `lend` method will not be available for classes which do not
 *          implement `Lendable` interface.
 */
