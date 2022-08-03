package com.example.javamy.Syntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class level7_lekcia5_samaya_10_str_massiva {
    public static void main(String[] args) throws IOException {
        ArrayList<String>  list = new ArrayList<>();
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        for (int i=0; i<10; i++){
          //  String ss = reader.readLine();
            list.add(0, reader.readLine());
        }

        for (String s:list){
            System.out.println(s);

        }



        /*int dlina=0;
        for (String s :list){
            if (s.length()>dlina){

            System.out.println(s.length());}

        }*/


    }
}
