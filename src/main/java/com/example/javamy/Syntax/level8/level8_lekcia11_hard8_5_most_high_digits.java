package com.example.javamy.Syntax.level8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class level8_lekcia11_hard8_5_most_high_digits {public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] array = new int[6];
    for (int i = 0; i < array.length; i++) {
        array[i] = Integer.parseInt(reader.readLine());
    }

    sort(array);

    System.out.println(array[0]);
    System.out.println(array[1]);
    System.out.println(array[2]);
    System.out.println(array[3]);
    System.out.println(array[4]);
}

    public static void sort(int[] array) {
        //напишите тут ваш код
// ВАЖНО АЛГОРИТМ ОБРАТНОЙ СОРТИРОВКИ МАССИВА
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i]<array[j]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }

            }
        }


    }
}

