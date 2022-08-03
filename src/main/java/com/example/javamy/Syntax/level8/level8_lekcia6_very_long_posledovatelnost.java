package com.example.javamy.Syntax.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class level8_lekcia6_very_long_posledovatelnost {

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int dlina =1;
        int temp=1;
        for (int i = 0, j=1; j <list.size() ; i++, j++) {

               if (list.get(i).equals(list.get(j)) ){
                   temp+=1;
                   if (temp>dlina){
                       dlina = temp;}
               }
                else { temp=1;}
        }
        System.out.println(dlina);
    }

}
