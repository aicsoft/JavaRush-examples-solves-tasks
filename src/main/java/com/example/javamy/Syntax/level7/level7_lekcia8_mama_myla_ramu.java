package com.example.javamy.Syntax.level7;

import java.util.ArrayList;

public class level7_lekcia8_mama_myla_ramu {
    public static void main(String[] args) {
      //  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        System.out.println(list.size());

        for (int i = 0; i <list.size(); i++) {
            i++;
            list.add(i, "именно");

        }

        for (String s:list ) { System.out.println(s);  }

    }
}
