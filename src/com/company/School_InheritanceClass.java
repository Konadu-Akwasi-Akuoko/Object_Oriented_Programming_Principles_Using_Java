package com.company;

//INHERITANCE
public class School_InheritanceClass {
    protected String schoolName;
    public String schoolNameShortForm;
    protected String dateEstablished;

    //Constructors
    public School_InheritanceClass(){
        schoolName = "Akenten Appiah Menka University";
        schoolNameShortForm = "AAMUSTED";
        dateEstablished = "1st January 1900";
    }

    public void LocationOfSchool(){
        System.out.println("My school is located at Tanoso, Kumasi.");
    }
}
