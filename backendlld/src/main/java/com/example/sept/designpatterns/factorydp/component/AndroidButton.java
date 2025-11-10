package com.example.sept.designpatterns.factorydp.component;

public class AndroidButton implements Button {

    @Override
    public void changeSize() {
        System.out.println("changing button size for android");
    }

    @Override
    public void changeColor() {
        System.out.println("changing color for android");
    }
    
}
