package com.example.javamy.Syntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level7_lekica4_obshenie_odinokih_massivov {
    public static void main(String[] args) throws IOException {

        String[] strArray = new String[10];
        Integer[] intArray = new Integer[10];

        for (int i=0; i<strArray.length; i++)
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            strArray[i]= reader.readLine();
        }
        for (int i=0,j=0; i<strArray.length; i++,j++){
            intArray[i]=strArray[j].length();
            System.out.println(intArray[i]);
        }



    }

}
