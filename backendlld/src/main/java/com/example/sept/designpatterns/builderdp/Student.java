package com.example.sept.designpatterns.builderdp;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String univName;
    private String batchName;
    private long id;
    private int gradYear;
    private String phoneNo;
        
    private Student(StudentHelper sHelper){
        this.name = sHelper.name;
        this.age = sHelper.age;
        this.gradYear = sHelper.gradYear;
        System.out.println("Student object created.....");
    }
    public static StudentHelper getBuilder(){
        return new StudentHelper(); 
    }

    static class StudentHelper {
        String name;
        int age;
        double psp;
        String univName;
        String batchName;
        long id;
        int gradYear;
        String phoneNo;
        public StudentHelper setName(String name) {
            this.name = name;
            return this;
        }
        public StudentHelper setAge(int age) {
            this.age = age;
            return this;
        }
        public StudentHelper setPsp(double psp) {
            this.psp = psp;
            return this;
        }
        public StudentHelper setUnivName(String univName) {
            this.univName = univName;
            return this;
        }
        public StudentHelper setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }
        public StudentHelper setId(long id) {
            this.id = id;
            return this;
        }
        public StudentHelper setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
        public StudentHelper setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }  
        public Student build() throws Exception{
            if(this.age >100){
                throw new Exception("Age should be < 100");
            }
            if(this.name.length() < 2 ){
                throw new Exception("FirstName should have >2 chars atleast");
            }
            return new Student(this);
        }
    }   

}
