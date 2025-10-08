package com.example.sept.oops.scaler.javaAdvancedConcepts.labSessionGenerics.InventoryManagement;

public class Clothing extends Item {
    private String size;

    public Clothing(String name, Double price, Integer quantity, String id, String size) {
        super(name, price, quantity, id);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    
}
