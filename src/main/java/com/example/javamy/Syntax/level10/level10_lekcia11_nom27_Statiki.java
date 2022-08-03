package com.example.javamy.Syntax.level10;

public class level10_lekcia11_nom27_Statiki {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        level10_lekcia11_nom27_Statiki solution = new level10_lekcia11_nom27_Statiki();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        level10_lekcia11_nom27_Statiki.D = 5 * D * C;

        level10_lekcia11_nom27_Statiki.D = 5;
    }

    public int getA() {
        return A;
    }

}
