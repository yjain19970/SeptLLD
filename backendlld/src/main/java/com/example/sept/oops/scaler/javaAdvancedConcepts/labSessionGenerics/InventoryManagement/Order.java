package com.example.sept.oops.scaler.javaAdvancedConcepts.labSessionGenerics.InventoryManagement;

public class Order implements Comparable<Order> {
    private String id;
    private Boolean isExpress;
    
    public Order(String id, Boolean isExpress) {
        this.id = id;
        this.isExpress = isExpress;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Boolean getIsExpress() {
        return isExpress;
    }
    public void setIsExpress(Boolean isExpress) {
        this.isExpress = isExpress;
    }

    @Override
    public int compareTo(Order o) {
        if(this.isExpress == o.isExpress){
            // If both are express orders, then sort by ID.
            return this.id.compareTo(o.id);
        }else if(this.isExpress){
            return -1;
        }else{
            return 1;
        }
    }

    
}
