package com.example.sept.oops.labsession1.m2;

public class NovelBook extends Book {
    // Have a constant for BookPrice.
    public static int bookPrice = 10;
    private String genre;

    // Parameterized constructor
    public NovelBook(String isbn, String title, String author, String genre) {
        super(isbn, title, author);
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("NovelBook - ISBN: " + isbn + ", Title: " + title + ", Author: " + author + ", Genre: " + genre);
    }

    public String getGenre() {
        return genre;
    }

}
