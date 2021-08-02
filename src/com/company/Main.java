package com.company;

import java.util.Scanner;
import com.myPackage.AddTwoNumbers;

public class Main {


    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

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

        //ENCAPSULATION
        System.out.println("Provide the following details:" + "\n" + "Hometown:");
        myObject.set_homeTown(getInput.nextLine());
        System.out.println("House number:");
        myObject.set_houseNumber(getInput.nextLine());
        System.out.println("House color:");
        myObject.set_houseColor(getInput.nextLine());
        System.out.println("Your home town is: " + myObject.get_homeTown());
        System.out.println("Your house number is: " + myObject.get_houseNumber());
        System.out.println("And lastly your house color is: " + myObject.get_houseColor());

        //PACKAGE AND API'S
        AddTwoNumbers addNumber = new AddTwoNumbers();
        addNumber.AddTwoIntegers(43,12);
    }
}

//Learn more about OOP here: https://www.w3schools.com/java/java_oop.asp

