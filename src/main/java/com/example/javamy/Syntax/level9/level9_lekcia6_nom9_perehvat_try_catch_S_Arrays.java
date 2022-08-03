package com.example.javamy.Syntax.level9;

public class level9_lekcia6_nom9_perehvat_try_catch_S_Arrays {

    public static void main(String[] args) {
        //напишите тут ваш код


        try {
            int[] m = new int[2];
            m[8] = 5;
            System.out.println(m);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        //напишите тут ваш код
    }
}



