package com.company;

public class Hospital2_UseInterface implements Hospital_InterfaceClass {
    @Override
    public void HospitalName() {
        System.out.println("The name of the hospital is KATH");
    }

    @Override
    public void HospitalLocation() {
        System.out.println("It is located at Kejetia-Kumasi.");
    }

    @Override
    public void HospitalAge() {
        System.out.println("The hospital is 59 years old.");
    }

    @Override
    public void HospitalNumberOfStaff() {
        System.out.println("The hospital have 1045 number of staff.");
    }
}
