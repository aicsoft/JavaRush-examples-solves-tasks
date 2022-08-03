package com.example.javamy.Syntax.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class level10_lekcia11_nom31_compile_HashMap {
    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public level10_lekcia11_nom31_compile_HashMap() {
        this.map = new HashMap<Integer, String>();
       // map.put(index, name);
    }

    public static void main(String[] args) throws IOException {
        level10_lekcia11_nom31_compile_HashMap solution = new level10_lekcia11_nom31_compile_HashMap();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 2; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            solution.map.put(index, name);
        }

        for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            if( index!=null && name!=null){
            System.out.println("Id=" + index + " Name=" + name);}
        }
    }
}

