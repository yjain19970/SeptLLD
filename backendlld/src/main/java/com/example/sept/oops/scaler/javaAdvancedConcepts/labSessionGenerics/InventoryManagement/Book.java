package com.example.sept.oops.scaler.javaAdvancedConcepts.labSessionGenerics.InventoryManagement;

public class Book extends Item {
    private String author;

    public Book(String name, Double price, Integer quantity, String id) {
        super(name, price, quantity, id);
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    
}
