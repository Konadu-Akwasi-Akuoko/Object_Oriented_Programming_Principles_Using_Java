package com.company;

public class Hospital1_UseInterface implements Hospital_InterfaceClass {
    @Override
    public void HospitalName() {
        System.out.println("First Care hospital.");
    }

    @Override
    public void HospitalLocation() {
        System.out.println("It is located at Kwadaso.");
    }

    @Override
    public void HospitalAge() {
        System.out.println("THe hospital is 24 year old.");
    }

    @Override
    public void HospitalNumberOfStaff() {
        System.out.println("The number of staff we have is 74.");
    }
}
