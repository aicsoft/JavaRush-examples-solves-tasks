package com.example.javamy.Syntax.level8;

import java.util.HashMap;
import java.util.Map;

public class level8_lekcia11_hard3_tezki {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Варламов","Егор");
        map.put("Широков","Костя");
        map.put("Широкова","Наташа");
        map.put("Миллер","Аксон");
        map.put("Валей","Игорь");
        map.put("Миллер","Дрон");
        map.put("Сатаева","Наташа");
        map.put("Варламов","Игорь");
        map.put("Пукин","Егор");
        map.put("Синь","Цзян Пин");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
