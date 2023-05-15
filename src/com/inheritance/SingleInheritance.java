package com.inheritance;

// Java program to illustrate the
// concept of single inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

// Parent class
class one {
    public void printOne() {
        System.out.println("One");
    }
}

class two extends one {
    public void printTwo() { System.out.println("Two"); }
}

// Driver class
public class SingleInheritance {
    // Main function
    public static void main(String[] args) {
        two g = new two();
        g.printOne();
        g.printTwo();
    }
}
