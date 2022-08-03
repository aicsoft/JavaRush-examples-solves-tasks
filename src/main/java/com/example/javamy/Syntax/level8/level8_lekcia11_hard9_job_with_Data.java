package com.example.javamy.Syntax.level8;

import java.text.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
// РАбота с датами Даты Date Calendar

public class level8_lekcia11_hard9_job_with_Data {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));

    }

    public static boolean isDateOdd(String date) throws ParseException {
/*        Date sss = new Date(date);
        Date janvar = new Date();
        janvar.setDate(1);
        janvar.setMonth(0);
      int year = janvar.setYear(sss.getYear());
        System.out.println();
        */

        Calendar cal = new GregorianCalendar();
        Date dateS = new Date(date);
        cal.setTime(dateS); // Give your own date
        int aaa = cal.get(Calendar.DAY_OF_YEAR);
        //System.out.println(cal.get(Calendar.DAY_OF_YEAR));

        boolean bul = (aaa%2==0)? false: true;


        return  bul;
    }
}

// ориганальное решение ДжаваРаша


/*
import java.util.Date;
Работа с датой
*/

/*
    public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date currentDate = new Date(date);
        Date startDate = new Date(date);
        startDate.setDate(1);
        startDate.setMonth(0);
        long time = currentDate.getTime() - startDate.getTime();
        long days = time / 24 / 60 / 60000 + 1;
        return days % 2 == 1;
    }
}      */





