package com.example.javamy.Syntax.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class lekcia11_chisla_po_ubivaniyu_5_chisel_VAZHNO {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        Integer[] list = new Integer[5];


        for (int i=0; i<list.length;i++){
           list[i] = Integer.parseInt(reader.readLine());
        }
        // сортировка по возрастанию
        //Arrays.sort(list);


        // сортировка по убыванию
        // Arrays.sort(list, Collections.reverseOrder());
        Arrays.sort(list, Collections.reverseOrder());

        for (int i=0; i< list.length;  i++) {
            System.out.println(list[i]);

        }


    }



}
