package com.example.javamy.Syntax.VSE_VSE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pus0minus_chisla {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
/*        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());*/
         if (a==0){  System.out.println( "ноль");}
         else if ((a<0)&&(a%2!=0)) {System.out.println( "отрицательное нечетное число");}
         else if ((a<0)&&(a%2==0)) {System.out.println( "отрицательное четное число");}
          else if (a%2!=0) {System.out.println( "положительное нечетное число");}
         else if (a%2==0) {System.out.println( "положительное четное число");}

    }


}
