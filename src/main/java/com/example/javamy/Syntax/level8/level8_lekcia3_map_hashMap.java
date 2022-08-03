package com.example.javamy.Syntax.level8;

import java.util.HashMap;
import java.util.Map;

public class level8_lekcia3_map_hashMap {
    public static void main(String[] args) {
        Map <String, String> map = new HashMap<>();
        map.put("арбуз","ягода");
        map.put("банан","трава");
        map.put("вишня","ягода");
        map.put("груша","фрукт");
        map.put("дыня","овощ");
        map.put("ежевика","куст");
        map.put("жень-шень","корень");
        map.put("земляника","ягода");
        map.put("ирис","цветок");
        map.put("картофель","клубень");
// ВАЖНО foreach HashMap
        for (Map.Entry<String, String> entry: map.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" - "+value);
        }


    }
}
