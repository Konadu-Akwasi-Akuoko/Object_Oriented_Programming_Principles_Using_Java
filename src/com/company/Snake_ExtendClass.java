package com.company;

public class Snake_ExtendClass extends Animal_AbstractClass {
    @Override
    public void About() {
        super.About();
    }

    @Override
    public void animalName() {
        System.out.println("Kaa");
    }

    @Override
    public void animalBreed() {
        System.out.println("Snake");
    }

    @Override
    public void animalColor() {
        System.out.println("Brown and black");
    }
}
