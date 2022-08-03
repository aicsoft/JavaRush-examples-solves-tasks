package com.example.javamy.Syntax.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lekcia16_srednee_chislo_iz_treh {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a =  Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());


        if ( (a>=b && a<=c)||(a<=b &&a>=c)){
            System.out.println(a);
        }
        else if ( (b>=a && b<=c)||(b<=a &&b>=c)){
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
 /*            if ((a==b)&&(b==c))     { System.out.println(a); }

             else if (a==b)     { System.out.println(a); }

             else if (b==c)     { System.out.println(b); }

             else if (c==a)     { System.out.println(c); }

             else if ((a>b)&&(a<c)&&(c<b))    { System.out.println(a); }
             else if ((a>b)&&(a<c)&&(c>b))    { System.out.println(a); }

             else if ((b>a)&&(b<c)&&(a>c))    { System.out.println(b); }
             else if ((b>a)&&(b<c)&&(a<c))    { System.out.println(b); }


             else if ((c<a)&&(c>b)&&(a<b))   {  System.out.println(c);}
             else if ((c<a)&&(c>b)&&(a>b))   {  System.out.println(c);}*/



    }
}