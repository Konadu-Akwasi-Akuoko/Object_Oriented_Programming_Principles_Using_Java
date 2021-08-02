package com.company;

public class Lion_ExtendClass extends Animal_AbstractClass {
    @Override
    public void About() {
        super.About();
    }

    @Override
    public void animalName() {
        System.out.println("Simba");
    }

    @Override
    public void animalBreed() {
        System.out.println("Lion");
    }

    @Override
    public void animalColor() {
        System.out.println("Yellowish brown");
    }
}
