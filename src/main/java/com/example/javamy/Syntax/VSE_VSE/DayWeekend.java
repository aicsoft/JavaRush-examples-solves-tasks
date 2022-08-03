package com.example.javamy.Syntax.VSE_VSE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DayWeekend {
    public static void main(String[] args) throws IOException {

        BufferedReader sto = new BufferedReader(new InputStreamReader(System.in));
        String str5 = sto.readLine();
        int day = Integer.parseInt(str5);
        // if  ((0>=day) || (day>7)){
        // System.out.println("Такого дня недели не существует");}
        //  else {}
        switch (day){
            case (1):
                System.out.println("понедельник");
                break;
            case (2):
                System.out.println("вторник");
                break;
            case (3):
                System.out.println("среда");
                break;
            case (4):
                System.out.println("четверг");
                break;
            case (5):
                System.out.println("пятница");
                break;
            case (6):
                System.out.println("суббота");
                break;
            case (7):
                System.out.println("воскресенье");
                break;
            default: System.out.println ("такого дня недели не существует");
                break;


        }


    }


}

