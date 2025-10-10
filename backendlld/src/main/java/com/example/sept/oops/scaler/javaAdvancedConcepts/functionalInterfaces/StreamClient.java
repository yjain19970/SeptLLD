package com.example.sept.oops.scaler.javaAdvancedConcepts.functionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamClient {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        
        // Create a stream in JAVA?
        Stream<Integer> stream = list.stream();

        // WAy-2
        Stream<Integer> stream2 = Stream.of(1,2,3,4,5,5,6,7);


        // WORKING WITH STREAMS...
        // Print all the odd numbers in the above list.
        for(Integer i : list){
            if(i%2 !=0){
                System.out.println("Number: " + i);
            }
        }


        List<Integer> oddList =  list.stream().filter( ((x) -> x%2 !=0) ).toList();
        Predicate<Integer> predicate = (x) -> x%2 != 0;
        System.out.println("Oddlist: " + oddList);

        // Usecase No:2


        /**
         * 
         * 
         * List of students.
         *  1. Students with marks >80 
         *  2. Get the marks of each student and do some operation on it.
         */

         List<Student> students = Arrays.asList(
            new Student("A", 17, 20),
            new Student("B", 20, 50),
            new Student("C", 21, 90) );
        
        
        List<Student> studentsWithMarks =  students.stream()
                                                .filter((s -> s.marks > 80)).toList();
        List<Integer> students2 =  students.stream().map(s -> s.age + 10).toList();

        List<Integer> ageList = new ArrayList<>();
        for(Student s : students){
            ageList.add(s.age+10);
        }

        // findAny()
        // anyMatch()
        // findAll()




       students.stream().map(s -> s.age + 10).close();
       // .toList();

       for(Student s : students){
            System.out.println("sdsds");
            s.age = s.age+10;
       }
       // Close the stream
       // Collect the data to something.



    }
}
