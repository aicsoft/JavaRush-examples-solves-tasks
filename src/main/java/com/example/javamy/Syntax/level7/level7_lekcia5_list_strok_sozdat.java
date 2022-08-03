package com.example.javamy.Syntax.level7;

import java.util.ArrayList;

public class level7_lekcia5_list_strok_sozdat {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Odin");
        list.add("Dva");
        list.add("Tri");
        list.add("Chetire");
        list.add("Pyat");
        System.out.println(list.size());
        for (int i=0; i<list.size(); i++){
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
