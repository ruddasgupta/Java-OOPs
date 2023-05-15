package com.inheritance;

// Java program to illustrate the
// concept of Multilevel inheritance

class uno {
    public void printOne()
    {
        System.out.println("One");
    }
}

class dos extends uno {
    public void printTwo() { System.out.println("Two"); }
}

class tres extends dos {
    public void printThree()
    {
        System.out.println("Three");
    }
}

// Drived class
public class MultiLevelInheritance {
    public static void main(String[] args)
    {
        tres g = new tres();
        g.printOne();
        g.printTwo();
        g.printThree();
    }
}