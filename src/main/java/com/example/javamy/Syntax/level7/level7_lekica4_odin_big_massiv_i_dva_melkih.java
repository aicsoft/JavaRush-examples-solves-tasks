package com.example.javamy.Syntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class level7_lekica4_odin_big_massiv_i_dva_melkih {
    public static void main(String[] args) throws IOException {
        int[] bigArray = new int[20];
        int[]  malArray1 = new int[10];
        int[] malArray2 = new int[10];
        for (int i=0; i<20;i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            bigArray[i] = Integer.parseInt(reader.readLine());
        }
// копируем массив от определенного индекса по другой
// пример malArray1=Arrays.copyOfRange(bigArray,0,10);
        malArray1=Arrays.copyOfRange(bigArray,0,10);
        malArray2=Arrays.copyOfRange(bigArray,10,20);
        for (int dig2:malArray2){
            System.out.println(dig2);
        }

        /*for (int i=0; i< 19;i++){
            if (i<=9 ){
                for (int j=0; j<=9;j++){
            }
        }*/


    }
}
