package com.example.javamy.Syntax.level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class level7_lekcia8_4_arrayLists {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ost3 = new ArrayList<>();
        ArrayList<Integer> ost2 = new ArrayList<>();
        ArrayList<Integer> others = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (Integer ii : list) {
            if (ii % 3 == 0) {
                ost3.add(ii);
            }
            if (ii % 2 == 0) {
                ost2.add(ii);
            }
            if (ii % 2 != 0 && ii % 3 != 0) {
                others.add(ii);
            }

        }



       printList(ost3);
       printList(ost2);
       printList(others);


    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int it1:list ) {
            System.out.println(it1);

        }

    }
}
