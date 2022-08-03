package com.example.javamy.Syntax.level8;

public class charTest {
    public static void main(String[] args) {
        String stroka = "  авав  авпыаыв  авыа в вв    ввв   в";
        char[] chars = stroka.toCharArray();
        chars[0]=Character.toUpperCase(chars[0]);
        String result="";
        for (int i = 0; i < chars.length ; i++) {

           char cha=  (i==0 || chars[i-1]==' ')?  Character.toUpperCase(chars[i]): chars[i];

                result+=cha ;




        }
        System.out.println(result);
    }
}
