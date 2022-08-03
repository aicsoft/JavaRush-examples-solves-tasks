package com.example.javamy.Syntax.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class level8_lekcia11_hard5_omovenie_Rama {
// ВАЖНО НЕ ПОНЯЛ - почти понял индивидуально для массивов символов решение
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        /*char[] chars = string.toCharArray();
        String result="";
        for (int i = 0; i < chars.length; i++) {
           char ch = (i==0 || chars[i-1]==' ')? Character.toUpperCase(chars[i]): chars[i];
            result+=ch;
            }

        System.out.println(result);*/
        String[] strArr = string.split(" +");
        for (String sss:strArr)
        {
            System.out.println(sss);
        }


        for (String str:strArr){

            if ( str!="")
            { System.out.print(str.substring(0,1).toUpperCase(Locale.ROOT)+str.substring(1,str.length()).toLowerCase()+" ");}


        }


    }
}








