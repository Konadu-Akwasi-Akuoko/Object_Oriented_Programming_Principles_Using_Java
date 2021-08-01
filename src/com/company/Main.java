package com.company;

public class Main {

    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.ReadName();
        System.out.println("This is a class variable - " + MyClass.Gender);
        System.out.println("This is an instance variable - " + myObject.FirstName);
    }
}

