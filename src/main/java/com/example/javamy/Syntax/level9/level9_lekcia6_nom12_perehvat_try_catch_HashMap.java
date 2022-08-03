package com.example.javamy.Syntax.level9;

import java.util.HashMap;

public class level9_lekcia6_nom12_perehvat_try_catch_HashMap {
    public static void main(String[] args) {
        //напишите тут ваш код


        try {

            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);

        } catch (NullPointerException e){
            System.out.println("NullPointerException");
        }

        //напишите тут ваш код
    }
}



