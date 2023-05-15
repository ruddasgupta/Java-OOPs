package com.examples;

public class Blocks {
    static int i = 0;
    int j = 0;
    static {
        System.out.println("static block");
    }
    {
        System.out.println("instance block");
    }

    void m1(){
        System.out.println("m1");
    }

    void incI() { i++;}
    void incJ() { j++;}

    static void m2(){
        System.out.println("m2");
    }

    public static void main(String[] args) {
        Blocks b = new Blocks();
        b.incI();
        b.incJ();
        System.out.println(b.i + " " + b.j);
        Blocks b1 = new Blocks();
        b1.incI();
        b1.incJ();
        System.out.println(b1.i + " " + b1.j);
        Blocks b3 = new Blocks();
        b3.incI();
        b3.incJ();
        System.out.println(b3.i + " " + b3.j);
    }
}
