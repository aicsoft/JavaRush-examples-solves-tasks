package com.example.javamy.Syntax.level8;

import java.util.HashMap;
import java.util.Map;

public class level8_lekcia8_sovpad_key_value {

    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Варламов","Егор");
        map.put("Широков","Костя");
        map.put("Широкова","Наташа");
        map.put("Миллер","Аксон");
        map.put("Валей","Игорь");
        map.put("Миллер1","Дрон");
        map.put("Сатаева","Наташа");
        map.put("Варламов1","Игорь");
        map.put("Пукин","Владеймир");
        map.put("Синь","Цзян Пин");
        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int countName=0;
        for (Map.Entry<String, String> entry:map.entrySet()){
            if (name.equals(entry.getValue())){
                countName+=1;
            }
        }
        return countName;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int countlastName=0;
        for (Map.Entry<String, String> entry:map.entrySet()){
            if (lastName.equals(entry.getKey())){
                countlastName+=1;
            }
        }
        return countlastName;

    }

    public static void main(String[] args) {


    }



}
