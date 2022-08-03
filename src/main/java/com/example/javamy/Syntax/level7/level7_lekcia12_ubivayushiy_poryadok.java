package com.example.javamy.Syntax.level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class level7_lekcia12_ubivayushiy_poryadok {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }


                ////////// ВАЖНО Алгоритм сортировки простой
    public static void sort(int[] array) {
            //напишите тут ваш код
                    for (int i = 0; i <array.length-1 ; i++) {
                    //    System.out.println("i =" +i);

                        for (int j = i; j < array.length ; j++) {
                            //       System.out.println("j =" +j);
                            if (array[i] < array[j]) {
                                int temp = array[i];
                                array[i] = array[j];
                                array[j] = temp;
                            }


                        }
                    }
    }
}


