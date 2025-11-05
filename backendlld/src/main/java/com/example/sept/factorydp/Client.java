package com.example.sept.factorydp;

import com.example.sept.factorydp.component.Button;

public class Client {
    public static void main(String[] args) throws Exception {
        Flutter flutter = new Flutter();
        UIFactory iosFactory =  flutter.geFactory("ios");
        Button b =  iosFactory.createButton();
        b.changeColor();
        b.changeSize();
    }
}
