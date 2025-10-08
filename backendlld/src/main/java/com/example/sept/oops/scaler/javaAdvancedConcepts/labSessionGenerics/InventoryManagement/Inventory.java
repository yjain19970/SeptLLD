package com.example.sept.oops.scaler.javaAdvancedConcepts.labSessionGenerics.InventoryManagement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Inventory<T extends Item> {
    private Map<String,T> items;

    public Inventory(Map<String, T> items) {
        this.items = items;
    }
    
    public void add(T itemT){
        /**
         * Do the validations later by self.
         */
        items.put(itemT.getId(), itemT);
    }

    public void remove(String id){
        items.remove(id);
    }

    public List<T> getAll(){
        return new ArrayList<>(items.values());
    }

    public T get(String id){
        // if item is present or not -- check
        return items.get(id);
    }
}
