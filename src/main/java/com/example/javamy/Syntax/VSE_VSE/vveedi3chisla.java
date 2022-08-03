package com.example.javamy.Syntax.VSE_VSE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vveedi3chisla {

    public static void main(String[] args) throws  IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String name =  reader.readLine();
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((a!=b)&&(b!=c)&&(a!=c))  {}
        else    if ((a<=b) &&(a<=c)&& (b<=c)) { System.out.println("1"); }
        else    if ((a<=b) && (a<=c)  && (b>=c)) { System.out.println("1");}

        else    if ((b<=a) &&(b<=c)&& (a<=c)) { System.out.println("2");}
        else    if ((b<=a) &&(b<=c)&& (a>=c)) { System.out.println("2");}

        else    if ((c<=b) && (c<=a) && (b<=a)) { System.out.println("3");}
        else    if ((c<=b) &&(c<=a)&& (b>=a)) { System.out.println("3");}

         /*System.out.println("И 18-ти достаточно");*/



    }


}
