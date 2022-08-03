package com.example.javamy.Syntax.level8;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class level8_lekcia6_10_000_vstavok {

    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        // напишите тут ваш код
        Date pered = new Date();
      //  pered.getTime();

        insert10000(list);

        Date current = new Date();
       //long now = current.getTime();
long total = current.getTime()-pered.getTime();
        // напишите тут ваш код
            return  total;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }



}
