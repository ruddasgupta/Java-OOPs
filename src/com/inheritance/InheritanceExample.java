package com.inheritance;// Java program to illustrate the
// concept of inheritance

// base class
class Bicycle {
    // the com.inheritance.Bicycle class has two fields
    public int gear;
    public int speed;

    // the com.inheritance.Bicycle class has one constructor
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    // the com.inheritance.Bicycle class has three methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    // toString() method to print info of com.inheritance.Bicycle
    public String toString()
    {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}

// derived class
class MountainBike extends Bicycle {

    // the com.inheritance.MountainBike subclass adds one more field
    public int seatHeight;

    // the com.inheritance.MountainBike subclass has one constructor
    public MountainBike(int gear, int speed,
                        int startHeight)
    {
        // invoking base-class(com.inheritance.Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    // the com.inheritance.MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of com.inheritance.Bicycle to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}

// driver class
public class InheritanceExample {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
    }
}
