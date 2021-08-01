package com.company;

public class MyClass {
    String FirstName = "Akwasi"; //Instance variable.
    String MiddleName = "Konadu"; //Attribute - variables in a class are called attributes of the class.
    String LastName = "Akuoko";
    public static String Gender = "I am a boy"; //Class variable.

    public void ReadName() { //Class method or function.
        System.out.println("My name is " + FirstName + " " + MiddleName + " " + LastName);
    }

    public void NonStaticMethod() {
        System.out.println("This is a non-static method and can be called only by creating objects" +
                " and referencing them through the dot syntax(.)");
    }

    public static void StaticMethod(){
        System.out.println("This is a static method and can be called/accessed without creating any object," +
                " but through class referencing and the dot syntax(.)");
    }
}
