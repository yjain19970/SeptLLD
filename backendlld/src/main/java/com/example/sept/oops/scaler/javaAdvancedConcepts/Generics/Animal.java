package com.example.sept.oops.scaler.javaAdvancedConcepts.Generics;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    public void doSomething(List<Animal> animals){
		for(Animal a : animals){
            animals.add(new Dog()); // CATS.add(new DOG())
        }	
	}


    public static void main(String[] args) {
        Animal a = new Animal();
        List<Animal> listAnimals = new ArrayList<>();
        a.doSomething(listAnimals);

        List<Cat> cats = new ArrayList<>();
    }


    // doSomething() --- 
    // I want to take input as Animal OR any child of ANIMAL.....
                                    // CATS/ DOGS
    public void doSomethingForAnimalChild(List<? extends Animal> list){
        /**
         * 
         * If I call this method:
         * 
         * doSomethingForAnimalChild(animalsList);
         * doSomethingForAnimalChild(listOfCats);
         * doSomethingForAnimalChild(listOfDogs);
         * 
         */
    }

    /**
     * I want to take Input as: List<AnyParent> of Dog.
     */
    public void doSomethingForAllParent(List<? super Dog> anyParentOfDog){
        /**
         * 
         * Whenever you are calling this method:
         *  List<Animal>
         *  List<Dog>
         *  List<Object>
         * 
         * 
         * 
         * doSomethingForAllParent(animalsList);
         * doSomethingForAllParent(dogsList);
         * doSomethingForAllParent(objectsList);
         * 
         */
    }
}
