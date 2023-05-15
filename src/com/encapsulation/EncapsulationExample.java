package com.encapsulation;

// Java program to demonstrate encapsulation

class Person {
    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String name;
    private int roll;
    private int age;

    // get method for age to access
    // private variable geekAge
    public int getAge() { return age; }

    // get method for name to access
    // private variable geekName
    public String getName() { return name; }

    // get method for roll to access
    // private variable geekRoll
    public int getRoll() { return roll; }

    // set method for age to access
    // private variable geekage
    public void setAge(int newAge) { age = newAge; }

    // set method for name to access
    // private variable geekName
    public void setName(String newName)
    {
        name = newName;
    }

    // set method for roll to access
    // private variable geekRoll
    public void setRoll(int newRoll) { roll = newRoll; }
}

public class EncapsulationExample {
    public static void main(String[] args)
    {
        Person obj = new Person();

        // setting values of the variables
        obj.setName("Bob");
        obj.setAge(21);
        obj.setRoll(1001);

        // Displaying values of the variables
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Roll: " + obj.getRoll());

        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " +
        // obj.geekName);
    }
}