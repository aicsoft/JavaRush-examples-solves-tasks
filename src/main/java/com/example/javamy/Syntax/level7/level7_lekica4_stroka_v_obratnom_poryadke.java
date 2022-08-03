package com.example.javamy.Syntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level7_lekica4_stroka_v_obratnom_poryadke {
    public static void main(String[] args) throws IOException {
        String[] strArray = new String[10];
        for (int i=0; i<8; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            strArray[i] = reader.readLine();

        }

        for (int i=9; i>= 0; i--){
            System.out.println( strArray[i]);
            strArray[3].length();


        }
// узнаем сколько символов в индексе массива
// пример  strArray[3].length()
        System.out.println(strArray[3].length());
    }
}


//        for (int i=0; i< strArr.length;i++) {
//             System.out.println(strArr[i]);
//        }

//        for (String s:strArr){
//            System.out.println(s);
//        }

