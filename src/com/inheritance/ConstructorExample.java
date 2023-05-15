package com.inheritance;

// Java Program to Illustrate
// Invocation of Constructor
// Calling Without Usage of
// super Keyword

// Class 1
// Super class
class Bse {

    // Constructor of super class
    Bse()
    {
        // Print statement
        System.out.println(
                "Base Class Constructor Called ");
    }
}

// Class 2
// Sub class
class Der extends Bse {

    // Constructor of subclass
    Der()
    {
        // Print statement
        System.out.println(
                "Derived Class Constructor Called ");
    }
}

// Class 3
// Main class
class ConstructorExample {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an object of subclass
        // inside main() method
        Der d = new Der();

        // Note: Here first super class constructor will be
        // called there after derived(subclass) constructor
        // will be called
    }
}