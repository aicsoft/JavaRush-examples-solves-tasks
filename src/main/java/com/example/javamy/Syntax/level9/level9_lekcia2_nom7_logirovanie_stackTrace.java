package com.example.javamy.Syntax.level9;

public class level9_lekcia2_nom7_logirovanie_stackTrace {

    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements ;
//        Thread.class.;
        System.out.println(
                Thread.currentThread().getStackTrace()[2].getClassName()+": "
                        +Thread.currentThread().getStackTrace()[2].getMethodName()+": "+text);

    }
}


