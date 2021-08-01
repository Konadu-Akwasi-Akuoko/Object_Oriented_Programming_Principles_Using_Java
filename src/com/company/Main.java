package com.company;

public class Main {
    int x = 25;
    static int y = 23;

    public static void main(String[] args) {
        Main myObject = new Main();
        Main myObject2 = new Main();
        System.out.println(myObject2.x);
        System.out.println(myObject.x);
        myObject.x = 345;
        myObject2.x = 452;
        System.out.println(myObject.x);
        System.out.println(myObject2.x);
        System.out.println(Main.y);
    }
}

