package com.example.javamy.Syntax.level9;

import java.util.*;

public class level9_lekcia11_nom28_Kotov_10 {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("Том1", new Cat("Том1"));
        map.put("Том2", new Cat("Том2"));
        map.put("Том3", new Cat("Том3"));
        map.put("Том4", new Cat("Том4"));
        map.put("Том5", new Cat("Том5"));
        map.put("Том6", new Cat("Том6"));
        map.put("Том7", new Cat("Том7"));
        map.put("Том8", new Cat("Том8"));
        map.put("Том9", new Cat("Том9"));
        map.put("Том10", new Cat("Том10"));
        return  map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> catSet = new HashSet<>();
        for (Map.Entry<String,Cat> entry: map.entrySet() ){
            Cat dd = entry.getValue();
            catSet.add(dd);

        }
        return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}



