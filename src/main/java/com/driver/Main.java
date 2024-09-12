package com.driver;

public class Main {
    public static void main(String[] args) {
        // Create an object of RWOnly
        RWOnly obj1 = new RWOnly();

        // Set the value using the setter method
        obj1.setName(3);

        // Get and print the value using the getter method
        System.out.println(obj1.getName());
    }
}
