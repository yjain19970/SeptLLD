package com.example.sept.oops.scaler.javaAdvancedConcepts.Generics;

import java.util.ArrayList;
import java.util.List;

import com.example.sept.oops.scaler.javaAdvancedConcepts.Pair;

public class Client {
    public static void main(String[] args) {
        // Create a Pair class, which can support any DataType.


        Pair<String,String> pairOfString = new Pair<>();
        pairOfString.first = "Yash";
        pairOfString.second = "Jain";
        System.out.println("PairOfString: " + pairOfString.getFirst() 
        + " " +  pairOfString.getSecond());


        Pair<Integer, Double> complexPair = new Pair<>();
        complexPair.first = 191;
        complexPair.second = 191.2;
        System.out.println("PairOfDouble: " + complexPair.getFirst() 
        + " " +  complexPair.getSecond());



        SingleDataTypePair<Integer> singlePair = new SingleDataTypePair<>();
        singlePair.first = 100;
        singlePair.second = 200;
        System.out.println("singlePair: " + singlePair.first + " " + singlePair.second);


        SingleDataTypePair<StudentDemo> studentDemoPair = new SingleDataTypePair<>();
        studentDemoPair.first.studentName = "Student Name";
        studentDemoPair.first.studentAge = 100;
        


        List<Integer> list = new ArrayList<>();
        //2D arrays?
        List<List<Integer>> twoDArray = new ArrayList<>();





        Pair<Integer, Integer> newPairX = new Pair<>();

        Pair.doSomething("Yash Jain", 101.2293823); // CALLING THE METHOD.
        Pair.doSomething(100, new ArrayList<>());




        Animal parentAnimal1 = new Dog();
        Animal animal = new Animal();

        List<Dog> dogsList = new ArrayList<>();
        dogsList.add(new Dog());


        List<Animal> animalsList = new ArrayList<>();
        animalsList.add(new Dog());

        // NOT SUPPORTED...
        animalsList.add(dogsList);

        // LIST<DOG> DOES NOT EXTEND LIST<ANIMAL>
        












    }
}

/**
 * 
 * 
 * 
 * Inheritance in GENERIC METHODS.
 *              Animal
 * 
 * Dog              Lion                Cat
 * 
 * 
 * 
 * Animal a = new Dog();
 * Animal ab = new Lion();
 * 
 * 
 * List<Animal> aList = new ArrayList<>();
 * aList.add(new Dog());
 * 
 * 
 * 
 * List<Dog> dogList  = new ArrayList<>();
 * 
 * dogList.add(new Animal());XXXXX
 * 
 * 
 * 
 * 
 * aList.add(dogs); /// Passing dogList to animals ist...
 * .. NOT ALLOWED HERE......
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
