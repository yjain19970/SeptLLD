package com.example.sept.designpatterns.factorydp;

import com.example.sept.designpatterns.factorydp.component.Button;
import com.example.sept.designpatterns.factorydp.component.IosButton;
import com.example.sept.designpatterns.factorydp.component.IosMenu;
import com.example.sept.designpatterns.factorydp.component.Menu;

public class IosUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        System.out.println("Inside iosFactory createButton...");
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        System.out.println("Inside iosFactory createMenu...");
        return new IosMenu();
    }
    
}
