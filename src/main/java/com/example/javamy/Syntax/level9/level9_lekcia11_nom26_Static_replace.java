package com.example.javamy.Syntax.level9;

public class level9_lekcia11_nom26_Static_replace {

    public static int A = 5;
    public static  int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        level9_lekcia11_nom26_Static_replace solution = new level9_lekcia11_nom26_Static_replace();
        level9_lekcia11_nom26_Static_replace.A = 5;

        level9_lekcia11_nom26_Static_replace.D = 5;
    }

    public int getA() {
        return A;
    }

}



