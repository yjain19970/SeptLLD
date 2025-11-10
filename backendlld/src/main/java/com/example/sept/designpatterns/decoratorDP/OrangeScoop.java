package com.example.sept.designpatterns.decoratorDP;

/**
 * This can exist independently as well.
 */
public class OrangeScoop implements IceCreamConeConstituents {

    private IceCreamConeConstituents iceCreamConeConstituents;
    
    public OrangeScoop(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    public OrangeScoop(){}

    @Override
    public String getDescription() {
        if(iceCreamConeConstituents !=null){
            return iceCreamConeConstituents.getDescription() + "Orange Cone";
        }
        return "Orange SCOOP";
    }

    @Override
    public int getCost() {
        if(iceCreamConeConstituents !=null){
            return iceCreamConeConstituents.getCost() + 20;
        }
        return 20;
    }
}
