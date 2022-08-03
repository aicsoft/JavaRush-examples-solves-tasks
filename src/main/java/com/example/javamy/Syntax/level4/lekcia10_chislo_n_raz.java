package com.example.javamy.Syntax.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lekcia10_chislo_n_raz {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader( System.in));
         String text = reader.readLine();
         int N = Integer.parseInt(reader.readLine());

         while (N>0){

             System.out.println(text);
             N--;
         }



    }
}
