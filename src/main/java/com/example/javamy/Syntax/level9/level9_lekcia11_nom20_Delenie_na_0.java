package com.example.javamy.Syntax.level9;

public class level9_lekcia11_nom20_Delenie_na_0 {
    public static void main(String[] args) {
      try {
          divideByZero();
      }catch (ArithmeticException e){
          e.printStackTrace();
      }


    }
    public  static void divideByZero(){
        int a= 8;
        int b=0;
        int sum=a/0;
        System.out.println(sum);
    }
}
