package com.company;

public class Main {

    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.ReadName();
        System.out.println("This is a class variable - " + MyClass.Gender); //Accessing a class variable (attribute).
        System.out.println("This is an instance variable - " + myObject.FirstName); //Accessing an instance variable (attribute).

    }
}

//Learn more about OOP here: https://www.w3schools.com/java/java_oop.asp

