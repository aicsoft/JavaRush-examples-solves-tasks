package com.example.javamy.Syntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level7_lekcia12_min_max_element {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код



        int [] list = getInts();
        maximum = list[0];
        minimum = list[0];

        for (int i = 0; i < list.length ; i++) {
            if (list[i]> maximum){
                maximum=list[i];
            }

            if (list[i] < minimum){
                minimum=list[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }

    //напишите тут ваш код

    public static int[] getInts () throws IOException {
        int[] list = new int[20];
        BufferedReader readerInt = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < list.length ; i++) {
            list[i] = Integer.parseInt(readerInt.readLine());

        }


        return list;
    }

}
