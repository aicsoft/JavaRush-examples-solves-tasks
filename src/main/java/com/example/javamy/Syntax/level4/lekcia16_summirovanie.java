package com.example.javamy.Syntax.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lekcia16_summirovanie {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        for (int i=0; i<100;i++) {

            int a = Integer.parseInt(reader.readLine());
            sum =sum +a;
            if (a==-1){break;}



        }
        System.out.println(sum);
    }
}
