package com.example.sept.factorydp;

import com.example.sept.factorydp.component.Button;
import com.example.sept.factorydp.component.IosButton;
import com.example.sept.factorydp.component.IosMenu;
import com.example.sept.factorydp.component.Menu;

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
