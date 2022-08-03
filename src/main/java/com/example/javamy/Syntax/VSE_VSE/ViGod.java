package com.example.javamy.Syntax.VSE_VSE;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ViGod {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        int days;
        if (year % 4 ==0) {  days=366;     }
        else if (year % 400==0) {  days=366;  }
        else if  (year % 100==0) { days=365;  }
        else {days=365;}

        System.out.println("количество дней в году: "+days);


    }
}
