package com.example.javamy.Syntax.VSE_VSE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class balans {


    public static void main(String[] args) throws IOException  {


    BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
        if (a == b) { System.out.println(b);}
        else  if (a > b) {System.out.println(b);}
    else  {System.out.println(a);}


    }
}

