package com.example.sept.factorydp;

import com.example.sept.factorydp.component.Button;
import com.example.sept.factorydp.component.Menu;

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
