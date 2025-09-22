package com.example.sept.oops.labsession1.m1;

public class Member extends User {
    private int borrowedBooksCount;
    private static final int MAX_BORROW_LIMIT = 5;

    // Constructors
    public Member() {
        super();
        this.borrowedBooksCount = 0;
    }

    public Member(String name, String contactInfo) {
        super(name, contactInfo);
        this.borrowedBooksCount = 0;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Books Borrowed: " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}
