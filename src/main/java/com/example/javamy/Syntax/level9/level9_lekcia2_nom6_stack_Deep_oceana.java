package com.example.javamy.Syntax.level9;

public class level9_lekcia2_nom6_stack_Deep_oceana {

    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element: stackTraceElements){
//            System.out.println(stackTraceElements.length);
//        }
      System.out.println(stackTraceElements.length);
        return stackTraceElements.length;

    }
}
