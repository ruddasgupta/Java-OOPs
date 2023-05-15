package com.inheritance;

interface un {
public void printUn();
        }

interface deux {
    public void printDeux();
}

interface trois extends un, deux {
    public void printUn();
}
class Quatre implements trois {
    @Override
    public void printUn() {
        System.out.println("Un");
    }

    public void printDeux() { System.out.println("Deux"); }
}

// Derived class
public class MultipleInheritance {
    public static void main(String[] args)
    {
        Quatre c = new Quatre();
        c.printUn();
        c.printDeux();
    }
}