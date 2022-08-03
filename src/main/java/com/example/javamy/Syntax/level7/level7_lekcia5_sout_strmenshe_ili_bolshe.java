package com.example.javamy.Syntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class level7_lekcia5_sout_strmenshe_ili_bolshe {

    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());

        }

        String Max= strings.get(0);
        String Min= strings.get(0);
        int MAX = 0;
        int MIN = 0;

        for (int i = 0; i < 10; i++) {
            if (strings.get(i).length() > Max.length()){
                Max = strings.get(i);
                MAX = i;

            }

            else if (strings.get(i).length() < Min.length()){
                Min = strings.get(i);
                MIN = i;

            }

        }


        if (MAX > MIN){
            System.out.println(Min);
        }
        else {
            System.out.println(Max);}




    }
}


class Math10 {
    public int max = Integer.MAX_VALUE;
    public int min = Integer.MIN_VALUE;
}