package com.example.javamy.Syntax.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class level8_lekcia11_hard11_modernization_PO {

    public static void main(String[] args) throws IOException {


            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            List<String> list = new ArrayList<>();
            while (true) {

                String city = reader.readLine();
                if (city.equals("")) {
                    break;
                }
                String family = reader.readLine();

                if (family.equals("")) {
                    break;
                }
                list.add(city);
                list.add(family);

            }

            // Read the house number
           String city2 = reader.readLine();
        for (int i = 0; i < list.size(); i++) {
           if (list.get(i).equals(city2)){
               System.out.println(list.get(i+1));
               break;

           }

        }

            /*if (0 <= city2 && city2 < list.size()) {
                String familyName = list.get(houseNumber);
                System.out.println(familyName);
            }
*/

//        if (0 <= city && city < list.size()) {
//            String familyName = list.add(city);
//            System.out.println(familyName);
//        }
    }
}

/*
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.add(family);
        }

        // Read the house number
        int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
        }
    }
}
*/

/*
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    HashMap<String,String> list = new HashMap<>();
        while (true) {
                String family = reader.readLine();
                String city = reader.readLine();
                if (family.isEmpty()) {
                break;
                }

                list.put(family,city);
                }

                // Read the house number
                String city = reader.readLine();
                for (Map.Entry<String, String> entry: list.entrySet()){
        if (city.equals(entry.getValue())){
        System.out.println(entry.getKey());
        }
        }*/
