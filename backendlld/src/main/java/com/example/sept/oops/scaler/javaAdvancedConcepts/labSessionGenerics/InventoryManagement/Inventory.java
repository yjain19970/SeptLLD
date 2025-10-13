package com.example.sept.oops.scaler.javaAdvancedConcepts.labSessionGenerics.InventoryManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;

import com.example.sept.oops.scaler.javaAdvancedConcepts.exceptionhandling.DuplicationItemException;
import com.example.sept.oops.scaler.javaAdvancedConcepts.exceptionhandling.InvalidQuantityException;

public class Inventory<T extends Item> {
    private Map<String,T> items;

    public Inventory(Map<String, T> items) {
        this.items = items;
    }
    
    public void add(T itemT) throws InvalidQuantityException{
        if(itemT.getQuantity() <0 || itemT.getQuantity() > 1000){
            throw new InvalidQuantityException("Item Quantity is Invalid");
        }

        // Checking before hand wether the item already exist or not.
        if(items.containsKey(itemT.getId())){
            throw new DuplicationItemException("Item is duplicate");
        }
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

    // Stream API functions
    public void printItemIds(){
        List<T> itemsList =  getAll();
        itemsList.stream().map(item -> item.getId()) // 
        .forEach(id -> System.out.println(id));
    }

    public void getItemsInLowerCase(){
        List<T> itemsList =  getAll();
        List<String> result =  itemsList.stream()
        .map(item -> item.getName().toLowerCase())
        .toList();
        System.out.println("Output: " + result);
    }

    public void createItemLengthList(){
        List<T> itemsList =  getAll();
         List<Integer> result = itemsList.stream()
        .map(item -> item.getName().length())
        .toList();

        System.out.println("Length Result: " + result);
    }

    public boolean checkIfQuantityGreaterThanZero(){
        List<T> itemsList =  getAll();
        return itemsList.stream()
        .anyMatch(item -> item.getQuantity() >0);
    }

    public boolean checkIfPriceGreaterThanZero(){
        List<T> itemsList =  getAll();
        return itemsList.stream()
        .allMatch(item -> item.getPrice() >0);
    }    
    
    public void combinedStreamOperations(){
        List<T> itemsList =  getAll();
        itemsList.stream().filter(item -> item.getPrice() > 1000
            && item.getQuantity() > 0)
            .map(item -> item.getName()).toList();
    }

    public void checkSomethign(){
        List<T> itemsList =  getAll();
        // Explore on the reduce function.
    }

    public void getTotalItemsInInventory(){
        List<T> itemsList =  getAll();
        
        // Using for loop
        int total=0;
        for(Item item: itemsList){
            total= total+ item.getQuantity();
        }

        // Using streams
        itemsList.stream()
        .map(item -> item.getQuantity())
        .reduce(0,(totalSum, quantity) -> totalSum + quantity);
    }


    public void getMostExpensiveItem(){
        List<T> itemsList =  getAll();

        Optional<T> mostExpensive =  itemsList
        .stream()
        .reduce((item1, item2) -> 
            item1.getPrice() > item2.getPrice() ? item1 : item2);

        T itemT =  mostExpensive.get();
        itemT.getId(); /// ERROR....

        if(mostExpensive.isPresent()){
            // code forward....
        }
    }


    public void concatItemNames(){
        List<T> itemsList =  getAll();
        Optional<String> concatStringValues =  Optional.ofNullable(itemsList
        .stream()
        .map(item -> item.getName())
        .reduce("DefaultValue", (concatString, name) -> concatString + "," + name));
    }




}
