package com.example.javamy.Syntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class level7_lekcia12_spisok_strok_poka_ne_enter_str_end {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list =new ArrayList<>();

        while (true){
            String str = reader.readLine();  // ВАЖНО повторить
            if (str.equals("end")){
                break;}
                else { list.add(str);}
            }

        for (String stroka: list) {
            System.out.println(stroka);}

    }
}
