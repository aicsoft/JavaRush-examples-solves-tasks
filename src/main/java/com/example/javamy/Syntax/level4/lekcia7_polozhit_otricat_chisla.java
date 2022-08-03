package com.example.javamy.Syntax.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lekcia7_polozhit_otricat_chisla {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String cifr_simvol= reader.readLine();
        int cifr1 = Integer.parseInt(reader.readLine());
        int cifr2 = Integer.parseInt(reader.readLine());
        int cifr3 = Integer.parseInt(reader.readLine());
//        int a=0; int b=0;int  c=0; int summa=0;
        int a=0, b=0,  c=0, summa=0;
        if (cifr1 >0)  {   a++;   }
        if (cifr2 >0)  {   b++;   }
        if (cifr3 >0)  {   c++;   }
        summa = a+b+c;



    }
}
