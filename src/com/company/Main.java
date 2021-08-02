package com.company;

public class Main {

    public static void main(String[] args) {
        //CLASSES AND OBJECTS
        MyClass myObject = new MyClass();
        myObject.ReadName();

        //INSTANCE VARIABLES AND CLASS VARIABLES
        System.out.println();
        System.out.println("This is a class variable - " + MyClass.Gender); //Accessing a class variable (attribute).
        System.out.println("This is an instance variable - " + myObject.FirstName); //Accessing an instance variable (attribute).

        //STATIC METHODS AND NON-STATIC METHODS
        System.out.println();
        myObject.NonStaticMethod(); //Accessing a non-static method/function through the object.
        MyClass.StaticMethod(); //Accessing a static method/function through the class.

        //CONSTRUCTORS.
        //Creating an object from a constructor and displaying the results.
        System.out.println();
        MyClass myConstructorObject = new MyClass("Yaw", "Vivian", "Ama", "Kwabena");
        System.out.println("My father's name is: " + myConstructorObject.FatherName);
        System.out.println("My mother's name is: " + myConstructorObject.MotherName);
        System.out.println("My sister's name is: " + myConstructorObject.SisterName);
        System.out.println("My brother's name is: " + myConstructorObject.BrotherName);

        //ABSTRACT CLASS
        //Using an abstract class.
        System.out.println();
        myObject.ListAnimalDetails(new Dog_ExtendClass());
        myObject.ListAnimalDetails(new Lion_ExtendClass());
        myObject.ListAnimalDetails(new Snake_ExtendClass());
    }
}

//Learn more about OOP here: https://www.w3schools.com/java/java_oop.asp

