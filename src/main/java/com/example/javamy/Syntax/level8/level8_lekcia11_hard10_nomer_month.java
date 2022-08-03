package com.example.javamy.Syntax.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class level8_lekcia11_hard10_nomer_month {

        public static void main(String[] args) throws IOException {
              //напишите тут ваш код
            HashMap<String, String> months = new HashMap<>();
            months.put("1","January");
            months.put("2","February");
            months.put("3","March");
            months.put("4","April");
            months.put("5","May");
            months.put("6","June");
            months.put("7","July");
            months.put("8","August");
            months.put("9","September");
            months.put("10","October");
            months.put("11","November");
            months.put("12","December");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        for (Map.Entry<String, String> entry:months.entrySet()){
                if (entry.getValue().equals(str)){
                    System.out.println(entry.getValue()+" is the "+entry.getKey()+" month");
                }
        }


        }
}

/*

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        String month = reader.readLine();
        if (months.contains(month)) {
            int monthNumber = months.indexOf(month) + 1;
            System.out.println(month + " is the " + monthNumber + " month");
        } else {
            System.out.println(month + " isn't a month");
        }
    }
*/
