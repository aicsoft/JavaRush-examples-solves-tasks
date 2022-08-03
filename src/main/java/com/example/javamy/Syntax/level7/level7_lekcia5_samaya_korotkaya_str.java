package com.example.javamy.Syntax.level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class level7_lekcia5_samaya_korotkaya_str {



    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList <String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<5; i++) {
            String ss = reader.readLine();
            strings.add(ss);

        }

       int dlina = 999999;
        for (int i=0; i<strings.size(); i++){
            if (strings.get(i).length()<dlina){
                dlina=strings.get(i).length();
            }
        }
    //  System.out.println(dlina);
        for (int i=0; i<strings.size(); i++){
            if (strings.get(i).length() == dlina){
                System.out.println(strings.get(i));

            }

        }
    }

}
