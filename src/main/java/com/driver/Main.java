package com.driver;

public class Main {
    public static void main(String[] args) {

        RWOnly obj1 = new RWOnly();
//        obj1.name=2;

        obj1.setName(3);
        obj1.getName();

    }
}
