package com.example.javamy.Syntax.level8;

import java.util.HashMap;
import java.util.Map;

public class level8_lekcia8_remove_zarplata_menshe_500 {

    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map <String, Integer> map = new HashMap();
        map.put("Варламов",320);
        map.put("Широков",425);
        map.put("Широкова",765);
        map.put("Миллер",545);
        map.put("Валей",432);
        map.put("Миллер1",542);
        map.put("Сатаева",432);
        map.put("Варламов1",2345);
        map.put("Пукин",865);
        map.put("Синь",213);
        return  map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
// МОЖНО ТАК map.entrySet().removeIf(stringIntegerEntry -> stringIntegerEntry.getValue() > 500);

      /*  Iterator <Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            if (itr.next().getValue()<500){
                itr.remove();
            }
        }*/

        Map<String, Integer> copyMap = new HashMap<>(map);
        for (Map.Entry<String, Integer> entry: copyMap.entrySet()){
            if (entry.getValue()<500){
                map.remove(entry.getKey());
            }
        }
    }


/*    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }*/




    public static void main(String[] args) {
       Map <String, Integer> mapp= createMap();
        removeItemFromMap(mapp);
        for (Map.Entry<String, Integer> entry: mapp.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }


}
