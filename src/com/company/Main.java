package com.company;
import java.util.Scanner;
import com.mypackage.AddTwoNumbers;

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

        //INHERITANCE
        MySchool_useInheritance school = new MySchool_useInheritance();
        school.LocationOfSchool();
        school.MySchool();

        //INNER CLASSES AND OUTER CLASSES
        MyClass outerClass = new MyClass();
        MyClass.MyInnerClass innerClass = outerClass.new MyInnerClass();
        innerClass.showInnerClass();

        //INTERFACES
        Hospital1_UseInterface hospital1 = new Hospital1_UseInterface();
        Hospital2_UseInterface hospital2 = new Hospital2_UseInterface();
        System.out.println("\n");
        hospital1.HospitalName();
        hospital1.HospitalAge();
        hospital1.HospitalLocation();
        hospital1.HospitalNumberOfStaff();
        hospital2.HospitalName();
        hospital2.HospitalAge();
        hospital2.HospitalLocation();
        hospital2.HospitalNumberOfStaff();
    }
}

//Learn more about OOP here: https://www.w3schools.com/java/java_oop.asp

