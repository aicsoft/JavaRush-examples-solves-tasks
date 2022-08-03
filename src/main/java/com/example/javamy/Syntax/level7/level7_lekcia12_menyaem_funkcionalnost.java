package com.example.javamy.Syntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class level7_lekcia12_menyaem_funkcionalnost {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<String>();
        for (int i = 0; i < strings.size(); i++) {
            String string = strings.get(i);
            resultStrings.add(string.toUpperCase());

        }

        for (int i = 0; i < resultStrings.size(); i++) {
            if(resultStrings.get(i).length()%2==0) {
                System.out.print(resultStrings.get(i)+" ");
                System.out.println(resultStrings.get(i));
            }
            if(resultStrings.get(i).length()%2!=0) {
                System.out.print(resultStrings.get(i)+" ");
                System.out.print(resultStrings.get(i)+" ");
                System.out.println(resultStrings.get(i));
            }

       }
    }
}

