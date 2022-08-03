package com.example.javamy.Syntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class level7_lekcia5_udalit_i_vstavit_13raz_str {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i < 13; i++) {
           String str = list.get(list.size()-1);
           list.remove(list.size()-1);
           list.add(0,str);

        }

        for (String sss:list) {
            System.out.println(sss);
        }

    }
}
