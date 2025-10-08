package com.example.sept.oops.scaler.javaAdvancedConcepts.labSessionGenerics.InventoryManagement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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


    public List<T> filterByPrice(double minPrice , double maxPrice) {
        List<T> filtered = new ArrayList<>();
        for(T item : items.values()) {
            if(item.getPrice() >= minPrice && item.getPrice() <= maxPrice) {
                filtered.add(item);
            }
        }
        return filtered;
    }

    public List<T> filterByAvailability() {
        List<T> filtered = new ArrayList<>();
        for(T item : items.values()) {
            if (item.getQuantity() > 0){
                filtered.add(item);
            }
        }
        return filtered;
    }

    public List<T> sortItems(Comparator<T> comparator){
        List<T> sortedItems = new ArrayList<>(items.values());
        Collections.sort(sortedItems , comparator);
        return sortedItems;
    }    
}
