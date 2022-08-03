package com.example.javamy.Syntax.level7;

import java.util.ArrayList;

//  ВАЖНО ПОВТОРЯТЬ ПОВТОРИТЬ
//
//
//
//
//
//
//
//
public class level7_lekcia8_fix_words {
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
        //напишите тут ваш код
            String strL = "л";
            String strR = "р";

            ArrayList<String> list = new ArrayList<>();
            for (String string : strings) {
                boolean L =string.contains(strL);
                boolean R =string.contains(strR);

                if (R && !L){    continue;    }
                if ( !R && L) { list.add(string);}

                list.add(string);

               // else if ( strings.get(i).matches("р")  ){ strings.remove(i); }
            }
            return list;
    }



}





