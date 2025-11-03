package com.example.sept.designpatterns.prototypeAndRegistry;

public class IntelligentStudent extends Student {
    int iq;

    public IntelligentStudent(IntelligentStudent intelligentStudent){
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

 
    @Override
    public Student clone() {
        return new IntelligentStudent(this);
    }
}
