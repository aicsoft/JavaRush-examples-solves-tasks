package com.example.javamy.Syntax.level9;

public class level9_lekcia2__nom_return_stackTrace {
    public static void main(String[] args) {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        //напишите тут ваш код
    /*    StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        for (StackTraceElement element: stackTraceElement) {
            System.out.println(element.getMethodName());

        }*/



       // ТАК МОЖНО БЫЛО ННАПИСАТЬ
        return  Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        for (StackTraceElement element: stackTraceElement) {
            System.out.println(element.getMethodName());

        }
        return  stackTraceElement;
    }

    public static StackTraceElement[] method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        for (StackTraceElement element: stackTraceElement) {
            System.out.println(element.getMethodName());

        }
        return  stackTraceElement;
    }

    public static StackTraceElement[] method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        for (StackTraceElement element: stackTraceElement) {
            System.out.println(element.getMethodName());

        }
        return  stackTraceElement;
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        for (StackTraceElement element: stackTraceElement) {
            System.out.println(element.getMethodName());

        }
        return stackTraceElement;
    }
}

