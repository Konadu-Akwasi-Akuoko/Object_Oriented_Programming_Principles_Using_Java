package com.company;

public class Dog_ExtendClass extends Animal_AbstractClass{
    @Override
    public void About() {
        super.About();
    }

    @Override
    public void animalName() {
        System.out.println("Jack");
    }

    @Override
    public void animalBreed() {
     System.out.println("Dog");
    }

    @Override
    public void animalColor() {
        System.out.println("Brown and black");
    }
}
