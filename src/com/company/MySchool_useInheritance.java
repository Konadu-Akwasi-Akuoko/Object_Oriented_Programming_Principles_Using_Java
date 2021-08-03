package com.company;

//INHERITANCE
public class MySchool_useInheritance extends School_InheritanceClass {
    public void MySchool() {
        System.out.println("The name of my school is: " + schoolName);
        System.out.println("The short form of my school is: " + schoolNameShortForm);
        System.out.println("The year it was established was: " + dateEstablished);
    }

    //POLYMORPHISM
    @Override
    public void LocationOfSchool() {
        System.out.println("My school is also located at Kwadaso, Kumasi.");
    }
}
