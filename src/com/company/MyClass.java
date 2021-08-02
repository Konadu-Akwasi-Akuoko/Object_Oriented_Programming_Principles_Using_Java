package com.company;

public class MyClass {
    String FirstName = "Akwasi"; //Instance variable.
    String MiddleName = "Konadu"; //Attribute - variables in a class are called attributes of the class.
    String LastName = "Akuoko";
    public static String Gender = "I am a boy"; //Class variable.

    //The following attributes will be initialized by the constructor.
    String FatherName;
    String MotherName;
    String SisterName;
    String BrotherName;

    //ENCAPSULATION
   private String _homeTown;
   private String _houseNumber;
   private String _houseColor;

   public void set_homeTown(String _homeTown){
       this._homeTown = _homeTown;
   }

   public void set_houseNumber(String _houseNumber){
       this._houseNumber = _houseNumber;
   }

   public void set_houseColor(String _houseColor){
       this._houseColor = _houseColor;
   }

    public String get_homeTown() {
        return _homeTown;
    }

    public String get_houseNumber() {
        return _houseNumber;
    }

    public String get_houseColor() {
        return _houseColor;
    }

    public MyClass() {  //This is a constructor, and it is used to initialize variables.

    }

    //Constructors can have two or more methods, thus they support method overloading, this means that you can
    //set many constructors as you want but all with different parameters.
    public MyClass(String fatherName, String motherName, String sisterName, String brotherName) {
        this.FatherName = fatherName;
        this.MotherName = motherName;
        this.SisterName = sisterName;
        this.BrotherName = brotherName;
    }

    public void ReadName() { //Class method or function.
        System.out.println("My name is " + FirstName + " " + MiddleName + " " + LastName);
    }

    public void NonStaticMethod() {
        System.out.println("This is a non-static method and can be called only by creating objects" +
                " and referencing them through the dot syntax(.)");
    }

    public static void StaticMethod() {
        System.out.println("This is a static method and can be called/accessed without creating any object," +
                " but through class referencing and the dot syntax(.)");
    }

    //USAGE OF ABSTRACT CLASSES.
    public void ListAnimalDetails(Animal_AbstractClass animals){
        animals.About();
        animals.animalName();
        animals.animalColor();
        animals.animalBreed();
    }
}
