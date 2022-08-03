package com.example.javamy.Syntax.level8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class level8_lekcia8_zinaida_slovar {

    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMM M d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Аронова", dateFormat.parse("JUNE 23 2012"));
        map.put("Аскеров", dateFormat.parse("JANUARY 13 2022"));
        map.put("Майер", dateFormat.parse("SEPTEMBER 8 1992"));
        map.put("Дуглас", dateFormat.parse("AUGUST 7 1992"));
        map.put("Макс", dateFormat.parse("MAY 1 2012"));
        map.put("Баер", dateFormat.parse("MAY 4 2010"));
        map.put("Крю", dateFormat.parse("FEBRUARY 12 2001"));
        map.put("Смит", dateFormat.parse("MAY 14 2002"));
        map.put("Розенберг", dateFormat.parse("MAY 16 2000"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код

// ВАЖНО ПЕРЕБОР НЕСТАНДАРТНОЙ Map    Map<String, Date>

    Map<String, Date> mapCopy = new HashMap<>(map);
        Iterator<Map.Entry<String, Date>> itr = mapCopy.entrySet().iterator();
        while (itr.hasNext()){
            Date sss = itr.next().getValue();
            int month = sss.getMonth()+1;
           if ( month==6 || month==7 || month==8) {
               itr.remove();

           }
        }

    }

    public static void main(String[] args) throws ParseException {
       Map<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for (Map.Entry<String,Date> entry:map.entrySet()) {
            System.out.println(entry);
        }

    }
}

