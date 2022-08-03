package com.example.javamy.Syntax.level5;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class lekcia12_schitivaem_4isla {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        if (N<=0) {
            return;
        }

        int[] massiv = new int[N];


        // добавим значения в массив
        for (int i=0; i< N; i++){
            massiv[i] = Integer.parseInt(reader.readLine());

        }

        int maximum = massiv[0];
        for(int i=1; i<massiv.length; i++){
            if (massiv[i]>maximum) {
                maximum=massiv[i];
            }

        }
        System.out.println(maximum);










    }
}
