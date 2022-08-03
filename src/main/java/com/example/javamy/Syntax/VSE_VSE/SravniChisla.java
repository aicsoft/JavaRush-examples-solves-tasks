package com.example.javamy.Syntax.VSE_VSE;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SravniChisla {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
         if ( (a==b) && (b==c)) { System.out.print(a +" " + b + " " + c);     }
        else if (a==b) { System.out.print(a+" "+b);  }
        else if (b==c) {  System.out.print(b+" "+c);    }
        else if (a==c) {  System.out.print(a+" "+c);    }

    }}
