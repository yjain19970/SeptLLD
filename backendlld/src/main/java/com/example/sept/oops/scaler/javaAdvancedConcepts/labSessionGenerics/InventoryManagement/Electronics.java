package com.example.sept.oops.scaler.javaAdvancedConcepts.labSessionGenerics.InventoryManagement;

public class Electronics extends Item {
    private int warrantyInYears;
    
    public Electronics(String name, Double price, Integer quantity, String id) {
        super(name, price, quantity, id);
        //TODO Auto-generated constructor stub
    }

    public int getWarrantyInYears() {
        return warrantyInYears;
    }

    public void setWarrantyInYears(int warrantyInYears) {
        this.warrantyInYears = warrantyInYears;
    }

}
