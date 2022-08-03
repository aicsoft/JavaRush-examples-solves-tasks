package com.example.javamy.Syntax.level9;

public class level9_lekcia2__nom3_snova_StackTrace {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        String s1="";
        for (int i = 0; i < stack.length ; i++) {
         if (stack[i].getMethodName().equals("method1")){
             s1=stack[i+1].getMethodName();
          //  System.out.println(stack[i+1].getMethodName());
         }

        }
        return s1;

    }

    public static String method2() {
        method3();
        //StackTraceElement[] stack = Thread.currentThread().getStackTrace()[2].getMethodName();
        /*String s2="";
        for (int i = 0; i < stack.length ; i++) {
            if (stack[i].getMethodName().equals("method2")){
                s2=stack[i+1].getMethodName();
             //   System.out.println(stack[i+1].getMethodName());
            }

        }*/

        System.out.println( Thread.currentThread().getStackTrace()[0].getMethodName());
        System.out.println( Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println( Thread.currentThread().getStackTrace()[2].getMethodName());
        System.out.println( Thread.currentThread().getStackTrace()[3].getMethodName());
        System.out.println("=========================================================");
        return Thread.currentThread().getStackTrace()[2].getMethodName();

    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        String s3="";
        for (int i = 0; i < stack.length ; i++) {
            if (stack[i].getMethodName().equals("method3")){
                s3=stack[i+1].getMethodName();
              //  System.out.println(stack[i+1].getMethodName());
            }

        }

    /*    System.out.println( Thread.currentThread().getStackTrace()[0].getMethodName());
        System.out.println( Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println( Thread.currentThread().getStackTrace()[2].getMethodName());
        System.out.println( Thread.currentThread().getStackTrace()[3].getMethodName());
        System.out.println("=========================================================");*/
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        String s4="";
        for (int i = 0; i < stack.length ; i++) {
            if (stack[i].getMethodName().equals("method4")){
                s4=stack[i+1].getMethodName();
               // System.out.println(stack[i+1].getMethodName());
            }

        }
        return s4;
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        String s5="";
        for (int i = 0; i < stack.length ; i++) {
            if (stack[i].getMethodName().equals("method5")){
                s5=stack[i+1].getMethodName();
               // System.out.println(stack[i+1].getMethodName());
            }

        }
        return s5;
    }
}

