package com.example.javamy.Syntax.level9;

public class level9_lekcia8_nom15_perehvat_try_catch_Group_Exception {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            method1();
        } catch (Exception1 e) {
            System.out.println(e.getMessage());
        }

        //напишите тут ваш код

    }

    public static void method1() throws Exception1, Exception2, Exception3 {
        int i = (int) (Math.random() * 3);
        if (i == 0) {
            throw new Exception1();
        } else if (i == 1) {
            throw new Exception2();
        } else if (i == 2) {
            throw new Exception3();
        }
    }
}

class Exception1 extends Exception {
}

class Exception2 extends Exception1 {
}

class Exception3 extends Exception2 {
}
