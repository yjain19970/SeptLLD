package com.example.sept.designpatterns.factorydp;

import com.example.sept.designpatterns.factorydp.component.AndroidButton;
import com.example.sept.designpatterns.factorydp.component.AndroidMenu;
import com.example.sept.designpatterns.factorydp.component.Button;
import com.example.sept.designpatterns.factorydp.component.Menu;

public class AndroidUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        System.out.println("Inside androidFactory createButton");
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        System.out.println("Inside androidFactory createMenu");
        return new AndroidMenu();
    }
    
}
