package com.example.javamy.Syntax.level10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class level10_lekcia11_nom33_Vse_algosy {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

        public static void sort(int[] array) {
            //напишите тут ваш код

            for (int i = 0; i < array.length ; i++) {
                for (int j = i; j < array.length; j++) {
                    if (array[i]>array[j]){
                        int temp = array[j];
                            array[j]=array[i];
                            array[i]=temp;

                }

            }

        }
    }
}