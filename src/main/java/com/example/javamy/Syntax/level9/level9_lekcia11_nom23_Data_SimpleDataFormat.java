package com.example.javamy.Syntax.level9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class level9_lekcia11_nom23_Data_SimpleDataFormat {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String text = "2013-08-18";
        String text = reader.readLine();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

    /// СУКА ВАЖНО, правильный парсинг даты из форматера SimpleDataFormat
        Date date = df.parse(text);


        SimpleDateFormat dd = new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);

        System.out.println(dd.format(date).toUpperCase());

       // System.out.println( date);

       ///////////////
    }

}

