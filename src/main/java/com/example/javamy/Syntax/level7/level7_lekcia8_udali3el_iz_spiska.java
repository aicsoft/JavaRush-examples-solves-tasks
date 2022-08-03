package com.example.javamy.Syntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class level7_lekcia8_udali3el_iz_spiska {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        strings.remove(2);
        for (int i = strings.size()-1; i >= 0; i--) {
            if (strings.get(i) != null) {
            System.out.println(strings.get(i));}

        }

    }
}
