package com.example.javamy.Syntax.level4;

import java.io.IOException;

public class lekcia10_tablica_umnojenia {
    public static void main(String[] args) throws IOException {
        int i = 1;
        int e = 1;

        while (i <= 10) {
            int j = 1;
              // for(int f=1; f<=10; f++)
            while ( j <= 10){
                System.out.print(i * j + " ");
                j++;

            }
            System.out.println(" ");
            i++;
        }
/*        int i = 1;
        int j = 1;

        while (i <= 10) {

            for(int f=1; f<=10; f++)
            {System.out.print(i * f + " ");
                j++;}
            System.out.println(" ");
            i++;
        }*/



    }

}