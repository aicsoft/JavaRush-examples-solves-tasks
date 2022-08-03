package com.example.javamy.Syntax.level8;

import java.util.HashMap;
import java.util.Map;

public class level8_lekcia3_sout_spisok_keys {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map) {
        //напишите тут ваш код
        for (Map.Entry<String, String> entry: map.entrySet())
            System.out.println(entry.getKey());
    }


}
