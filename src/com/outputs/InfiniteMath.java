package com.outputs;

class Math {
    public final double secret = 2;
}

class ComplexMath extends Math {
    public final double secret = 4;
}

public class InfiniteMath extends ComplexMath {
    public final double secret = 8;

    public static void main(String[] numbers) {
        ComplexMath math = new InfiniteMath();
        System.out.print(math.secret);
    }
}