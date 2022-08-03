package com.example.javamy.Syntax.level10;

public class level10_lekcia4_nom7_preobraz_primitiv_tipov {
    public static void main(String[] args) {
        long l =  1234_564_890L;
        int x = (short) 0b1000_1100_1010;
        double m = (short) 110_987_654_6299.123_34;
        float f = (int) l++ + 10 + ++x - (float) m;
        l = (int) f / 1000;
        System.out.println(l);
        System.out.println("*******************");
        System.out.println(l);
        System.out.println(x);
        System.out.println(m);
        System.out.println(f);
    }
}


// l = 1234567