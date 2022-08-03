package com.example.javamy.Syntax.level8;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class level8_lekcia3_sout_10_str_Object {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
    //    map.put("Eat", new Long(56));
     //   map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        //напишите тут ваш код
        for (Map.Entry<String, Object> entry:map.entrySet()){


        System.out.println(entry.getKey()+" - "+entry.getValue());

        }

        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int secs = currentTime.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);


}



}
