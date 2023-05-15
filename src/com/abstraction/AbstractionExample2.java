package com.abstraction;

// Abstract class
abstract class Vehicle {
    // Abstract method (does not have a body)
    public abstract void VehicleSound();
    // Regular method
    public void honk() { System.out.println("honk honk"); }
}

// Subclass (inherit from Vehicle)
class Car extends Vehicle {
    public void VehicleSound()
    {
        // The body of VehicleSound() is provided here
        System.out.println("kon kon");
    }
}

class AbstractionExample2 {
    public static void main(String[] args)
    {
        // Create a Car object
        Car myCar = new Car();
        myCar.VehicleSound();
        myCar.honk();
    }
}