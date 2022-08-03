package com.example.javamy.Syntax.level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class level7_lekcia9_doubling_strings {

    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());

        }


        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for (String str:result
             ) {
            System.out.println(str);
        }



        String[] sttt = {"sdsgsdgg","dsfsadfsad","faddsfs","fasfas"};

       // System.out.println(sttt[2].length());

    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String s =list.get(i);
            list2.add(s);
            list2.add(s);

        }


        return list2;
    }



}

