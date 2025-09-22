package com.example.sept.oops.labsession1.m2;

public class TextBook extends Book {
    private String subject;
    private int edition;

    // Parameterized constructor
    public TextBook(String isbn, String title, String author, String subject, int edition) {
        super(isbn, title, author);
        this.subject = subject;
        this.edition = edition;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("TextBook - ISBN: " + isbn + ", Title: " + title + ", Author: " + author + ", Subject: " + subject + ", Edition: " + edition);
    }

    public String getSubject() {
        return subject;
    }

    public int getEdition() {
        return edition;
    }

    
    
}
