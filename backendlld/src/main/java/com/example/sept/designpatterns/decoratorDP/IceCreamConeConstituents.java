package com.example.sept.designpatterns.decoratorDP;

/*
 * Ingredients in our case.
 * 
 * Any ingredient will implement this interface.
 */
public interface IceCreamConeConstituents {
    int getCost(); // return the cost
    String getDescription(); // description. 
}
