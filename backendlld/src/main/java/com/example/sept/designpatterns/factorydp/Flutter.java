package com.example.sept.designpatterns.factorydp;

public class Flutter {
    public void setTheme(){
        System.out.println("Setting theme for mobile...");
    }

    public void setRefreshRate(){
        System.out.println("Setting refresh rate for mobile...");
    }
    

    public UIFactory geFactory(String platform) throws Exception{
        return UIFactoryFactory.getUIFactory(platform);
    }
}
