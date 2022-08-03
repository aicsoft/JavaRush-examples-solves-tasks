package com.example.javamy.Syntax.VSE_VSE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class  Svetofor {


            public static void main(String[]args) throws IOException {

        BufferedReader vvod=new BufferedReader(new InputStreamReader(System.in));
        double t=Double.parseDouble(vvod.readLine());
          //      System.out.println(t);

        if((t>0)&&(t<=2)){System.out.println("зелёный");}
        if((t>3)&&(t<4)){System.out.println("жёлтый");}
        if((t>4)&&(t<5)){System.out.println("красный");}

             }
    }
