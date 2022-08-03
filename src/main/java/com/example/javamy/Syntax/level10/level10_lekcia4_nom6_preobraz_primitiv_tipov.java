package com.example.javamy.Syntax.level10;

public class level10_lekcia4_nom6_preobraz_primitiv_tipov {
    public static void main(String[] args) {
        double d = (int) 2.50256e2d; //  250= 2,50,256*100,00
        char c =  'd';  //64
        short s = (short) 2.22; //2
        int i =  150000; //150000
        float f =  0.50f; // 0,5
        double result = f + (int)(i / c) - (d * s) - 500e-3; // 0,5
        // res = 0,5 +
        System.out.println(d);
        System.out.println(c);
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
        System.out.println("result: " + result);
    }
}

// result = 1000.0