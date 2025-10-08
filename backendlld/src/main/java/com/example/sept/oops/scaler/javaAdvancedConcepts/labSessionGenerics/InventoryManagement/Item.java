package com.example.sept.oops.scaler.javaAdvancedConcepts.labSessionGenerics.InventoryManagement;

public class Item implements Comparable<Item>{
    private String name;
    private Double price;
    private Integer quantity;
    private String id;

    public Item(String name, Double price, Integer quantity, String id) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int compareTo(Item o) {
        if(this.price < o.price){
            return -1;
        }else if(this.price > o.price){
            return 1;
        }else{
            return 0;
        }
    }


    
}
