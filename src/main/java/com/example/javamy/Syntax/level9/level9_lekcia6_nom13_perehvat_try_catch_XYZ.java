package com.example.javamy.Syntax.level9;

public class level9_lekcia6_nom13_perehvat_try_catch_XYZ {
    public static void main(String[] args) {
        //напишите тут ваш код

//        int num = Integer.parseInt("XYZ");
//        System.out.println(num);
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }
        //напишите тут ваш код
    }
}


