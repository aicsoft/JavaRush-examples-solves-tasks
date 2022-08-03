package com.example.javamy.Syntax.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lekcia16_my_name_my_birth {
    public static void main(String[] args) throws IOException {

       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name= reader.readLine();
        int y= Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        System.out.println("Меня зовут "+name+".");
        System.out.println("Я родился  "+ d+"."+m+"."+y);

    }
}