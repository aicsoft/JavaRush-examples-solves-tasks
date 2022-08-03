package com.example.javamy.Syntax.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lekcia5_5zadanie_chet_i_nechet_kolvo_cifr {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stroka = reader.readLine();
        int vvod = Integer.parseInt(stroka);
        // тут мы создали массив Симоволов из введенной строки
        char[] simvols = new char[stroka.length()];

        // тут добавляем массив элементов из строки
        for (int i = 0; i < simvols.length; i++) {
            simvols[i] = stroka.charAt(i);
        }

        // тут читаем элемент и делим на % и записываем результат в переменные
        for (int e = 0; e < simvols.length; e++) {
            if (simvols[e] % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;


            }


            // for (int j=0; j<10; j++)
        /*if (vvod%2==0){
            even=even+1;
        }
        else {
            odd=odd+1;
        }*/
        }

            System.out.println("Even: " + even + " " + "Odd: " + odd);

        System.out.println(stroka.toCharArray());

    }
}