package com.example.javamy.Syntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level7_lekica4_pereverni_massiv {
    public static void main(String[] args) throws IOException {
        int[]intArray = new int[10];
        for (int i=0; i<intArray.length; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            intArray[i] = Integer.parseInt(reader.readLine());
        }
   //     Arrays.sort(intArray);
        for (int i=9; i>=0;i--){
            System.out.println(intArray[i]);
        }

    }


}
