package com.example.sept.oops.scaler.javaAdvancedConcepts.labSessionGenerics.InventoryManagement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecentlyViewItems {
    private Integer MAX_SIZE = 3;
    private LinkedList<Item> items;

    public RecentlyViewItems( LinkedList<Item> items) {
        this.items = items;
    }


    public void addRecentlyViewedItem(Item item){
        if(items.size() >= MAX_SIZE){
            items.removeLast();
        }
        items.remove(item); // 
        items.addFirst(item);
    }


    public List<Item> getAllViewedItems(){
        return new ArrayList<>(items);
    }
    
}
