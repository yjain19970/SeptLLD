package com.example.sept.designpatterns.factorydp;

import com.example.sept.designpatterns.factorydp.component.Button;
import com.example.sept.designpatterns.factorydp.component.Menu;

/**
 * This is AbstractFactory
 */
public interface UIFactory {
    Button createButton(); // abstract factory method
    Menu createMenu(); // abstract factory method
} 
/**
 * Abstract Factory design pattern.
 * because all the methods in the interface are abstract factory methods.
 *  -- which have return type of interface.
 */
