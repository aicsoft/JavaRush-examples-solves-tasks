package com.example.javamy.Syntax.level8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class level8_lekcia11_hard12_zadacha_po_algoritmam {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        //Arrays.sort(array);
        String str ="";
        for (int a = 0; a < array.length; a++) {
            for (int b = a; b < array.length ; b++) {
                if (isGreaterThan(array[a], array[b])) {

                    str= array[a];
                    array[a]=array[b];
                    array[b]=str;
                }
//                   else {
//                    return;
//                     }

            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}

