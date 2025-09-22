package com.example.sept.oops.labsession1.m1;

public abstract class User {
    private static int idCounter = 0; // M2. 
    private final String userId;
    private String name;
    private String contactInfo;

    // Non Param constructor
    public User() {
        this.userId = generateUniqueId();
    }

    // Parameterized constructor
    public User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Copy constructor -- shallowCopy.
    public User(User other) {
        this.userId = other.userId;
        this.name = other.name;
        this.contactInfo = other.contactInfo;
    }

    // Generate a unique ID (for now, returns incrementing ID as a string)
    private static String generateUniqueId() {
        return String.valueOf(++idCounter);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getUserId() {
        return userId;
    }

    // Abstract methods
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
}
