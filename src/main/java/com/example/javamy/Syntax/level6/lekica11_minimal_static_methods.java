package com.example.javamy.Syntax.level6;


public  class lekica11_minimal_static_methods {


/*
Минимальное число статиков
*/         public static void main(String[] args) {
                new Solution().method1();
}

    public static  class Solution {
        public  int  step;



        public static void method1() {
            method2();
        }

        public static void method2() {
            new Solution().method3();
        }

        public void method3() {
            method4();
        }

        public void method4() {
            step++;
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element);
            }
            if (step > 1) {
                return;
            }
            main(null);
        }
    }


}


























