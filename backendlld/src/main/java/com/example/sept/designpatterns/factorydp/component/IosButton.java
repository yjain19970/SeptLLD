package com.example.sept.designpatterns.factorydp.component;

public class IosButton implements Button {

    @Override
    public void changeSize() {
        System.out.println("changing button size for iOS");
    }

    @Override
    public void changeColor() {
         System.out.println("changing color for iOS");
    }
    
}
