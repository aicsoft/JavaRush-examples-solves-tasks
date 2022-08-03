package com.example.javamy.Syntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class level7_lekcia9_uporad_list {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list=new ArrayList<>();

        for (int i=0; i<10; i++ ){
            list.add(reader.readLine());
        }

        for (int i=0, j=1; j<list.size(); i++, j++ ){
            if (list.get(i).length() >= list.get(j).length()){
                String s = list.get(j);
                System.out.println(list.indexOf(s));
                break;
              }


        }




    }
}
