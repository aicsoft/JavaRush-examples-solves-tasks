package com.example.javamy.Syntax.level10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class level10_lekcia11_nom30_self_extract_from_list {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(reader.readLine());
            list.add(number);
        }

        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 20, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
        //напишите тут ваш код
        int tir=0;
        for (int i = 0; i <list.size() ; i++) {
           // System.out.println(list.get(-5));
            try {
                   tir=  list.get(index);
                }
                catch (IndexOutOfBoundsException e){
                    tir = defaultValue;
                }
        }
        return tir;
    }

}



