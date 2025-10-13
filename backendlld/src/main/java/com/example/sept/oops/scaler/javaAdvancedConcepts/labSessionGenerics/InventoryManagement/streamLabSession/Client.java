package com.example.sept.oops.scaler.javaAdvancedConcepts.labSessionGenerics.InventoryManagement.streamLabSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.sept.oops.scaler.javaAdvancedConcepts.exceptionhandling.InvalidQuantityException;
import com.example.sept.oops.scaler.javaAdvancedConcepts.labSessionGenerics.InventoryManagement.Electronics;
import com.example.sept.oops.scaler.javaAdvancedConcepts.labSessionGenerics.InventoryManagement.Inventory;
import com.example.sept.oops.scaler.javaAdvancedConcepts.labSessionGenerics.InventoryManagement.Item;

public class Client {
    public static void main(String[] args) {
        Map<String, Item> itemsMap = new HashMap<>();
        itemsMap.put("item1", new Electronics("E1", 100.2, 2, "id-elec"));
        Inventory inventory = new Inventory<>(itemsMap);
        // inventory.getItemsInLowerCase();
        // inventory.createItemLengthList();


        Electronics elec  = new Electronics("E1", 100.2, 100002, "id-elec");
        try {
            inventory.add(elec);
        } catch (InvalidQuantityException e) {
            System.out.println("Input: " + elec + " is not valid input. The input should be .....");
            System.out.println("Exception thrown.. + "+ e.getMessage());
        } finally{
            System.out.println("Finally!!!");
        }



    }
}
