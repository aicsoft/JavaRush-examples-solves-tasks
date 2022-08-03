package com.example.javamy.Syntax.level7;

import java.util.ArrayList;

public class level7_lekcia8_fix_words555 {
    public static void main(String[] args) {

                ArrayList<String> strings = new ArrayList<>();
                strings.add("роза");
                strings.add("лоза");
                strings.add("лира");
                strings.add("лиринна");
                strings = fix(strings);

                for (String string : strings) {
                    System.out.println(string);
                }
            }

            public static ArrayList<String> fix(ArrayList<String> strings) {

                String r = "р";
                String l = "л";

                ArrayList<String> result = new ArrayList<>();
                for (String string : strings) {
                                boolean isR = string.contains(r);
                                boolean isL = string.contains(l);

                                if (isR && !isL) {
                                    continue;
                                }

                                if (!isR && isL) {
                                    result.add(string);
                                }

                                result.add(string);
                     }
                     return result;

                 }
}




