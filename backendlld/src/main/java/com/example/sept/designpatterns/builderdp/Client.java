package com.example.sept.designpatterns.builderdp;

public class Client {
    
    public static void main(String[] args) throws Exception {
         Student student = Student.getBuilder()
         .setAge(99)
         .setBatchName("sdsds")
         .setId(23324L)
         .setName("Yash Jain")
         .build();
         System.out.println("Student: " + student);
    }
}
