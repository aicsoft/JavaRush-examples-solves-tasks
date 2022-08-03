package com.example.javamy.Syntax.VSE_VSE;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxDigit {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        if ((a == b) && (b == c) && (c == d)) {
            System.out.println(b);
        } else {
            System.out.println(Math.max(Math.max(a, b), Math.max(c, d)));
        }

    }
}