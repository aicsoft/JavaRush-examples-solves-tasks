package com.example.javamy.Syntax.level8;

import java.util.HashMap;
import java.util.Map;

public class level8_lekcia8_remove_10_duplicates_names {



    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map <String, String> map = new HashMap();
        map.put("Варламов","Егор");
        map.put("Широков","Костя");
        map.put("Широкова","Наташа");
        map.put("Миллер","Аксон");
        map.put("Валей","Игорь");
        map.put("Миллер1","Дрон");
        map.put("Сатаева","Наташа");
        map.put("Варламов1","Игорь");
        map.put("Пукин","Егор");
        map.put("Синь","Цзян Пин");
        return  map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> copyMapDup = new HashMap<>(map);
        for (String str:copyMapDup.values()){
                int count =0;
            for(String strDel:map.values()){
                if (str.equals(strDel)){
                    count+=1;
                }


            }
            if (count>1){
                removeItemFromMapByValue(map,str);
            }

        }


    }


    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map <String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }



}
