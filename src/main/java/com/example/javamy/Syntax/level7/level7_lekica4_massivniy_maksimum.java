package com.example.javamy.Syntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level7_lekica4_massivniy_maksimum {

    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int[] array = new int[4];
        for (int i=0; i<array.length; i++) {
            BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
            //String s = reader.readLine();
            int readInt = Integer.parseInt(reader.readLine());
            array[i]=readInt;
          //  System.out.println(array);

        }
        return array;
    }


    public static int max(int[] array) {
        // найди максимальное значение
//        int maxi = array[0];
//        for (int i=0; i<array.length; i++){
//            if (array[i] > maxi) {
//               maxi = array[i]  ;
//
//            }
//
//        }
//        return maxi;
        int max = Integer.MIN_VALUE;
    for (int dig:array){
        if (dig > max){
            max=dig;
        }

    }
    return  max;
    }
}
