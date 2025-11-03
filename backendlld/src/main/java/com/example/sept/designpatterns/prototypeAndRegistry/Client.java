package com.example.sept.designpatterns.prototypeAndRegistry;

public class Client {
    
    public static void main(String[] args) {
        Student ogStudentNov = new Student();
        ogStudentNov.setBatch("Nov2025");
        ogStudentNov.setAverageBatchPsp(10.55);

        // Student copyStudentNov =  ogStudentNov.clone();

        try {
            StudentRegistry.register("Student_Nov_2025", ogStudentNov);

            for(int i=0;i<5;i++){
               Student studentClone =  StudentRegistry
                    .getStudentTemplate("Student_Nov_2025").clone();
               
               studentClone.setAge(10);
               studentClone.setName("Input fromName");
               
               Database.setDatabase(studentClone);
            }
        } catch (Exception e) {
            System.out.println("Exception registering Student.");
        }
    }
}
