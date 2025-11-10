package com.example.sept.designpatterns.decoratorDP;

public class Client {
    public static void main(String[] args) {
        
        IceCreamConeConstituents iceCreamConeConstituents_1 = new OrangeScoop();
        IceCreamConeConstituents iConeConstituents_2 = 
            new ChocoChips(iceCreamConeConstituents_1);
        IceCreamConeConstituents iConeConstituents_3 = new OrangeScoop(iConeConstituents_2);


        System.out.println("Final icrecream:  " + iConeConstituents_3.getDescription());
        System.out.println("Final icrecream:  " + iConeConstituents_3.getCost());
        


        IceCreamConeConstituents iceCream = 
            new OrangeScoop(new ChocoChips(new OrangeScoop()));

        IceCreamConeConstituents icre = new OrangeScoop();
        System.out.println("SCOOP:  " + icre.getDescription());

    }
}
