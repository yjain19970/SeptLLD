package com.example.sept.oops.scaler;

public class Student {
    private String name; // null
    public String emailId;
    public String phoneNo;
    public int age; // 0
    public String dob;
    

    public Student(){}

    public Student(String name, String email, 
                   String phoneNo, int age, String dob){
        this.name = name;
        this.emailId = email;
        this.phoneNo = phoneNo;
        this.age = age;
        this.dob = dob;
    }

    // Actions/Behaviours
    public void raiseSupporRequest(){
        System.out.println("Raising Request....");
    }

    public void doAssignment(){
        System.out.println("Doing assignment....");
        someUtilityMethod();
    }

    private void someUtilityMethod(){

    }


        public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Student data" + student.name + " AGE:" + student.age);
        

        Student student2 = new Student("Yash Jain", "yash@gmail.com",
                                     "8282828282828", 30, "19.09.1995");
        
        System.out.println("Name: " + student2.name + " age: " + student2.age +
        "phone: " + student2.phoneNo);                     
        
    }



    /**
     * Two constructors of BankAccount
     * 
     * 1. It should always have ownerName, balance.
     * 2. If a account is created without ownerName and Balance,
     *     the initial value of balance: 0 and the ownerName should be "Some Name"
     */
}
