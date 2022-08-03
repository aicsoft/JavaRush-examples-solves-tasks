package com.example.javamy.Syntax.VSE_VSE;

import java.io.BufferedReader;
import java.io.InputStreamReader;

    public class Chisla {

        public static void main(String[] args) throws Exception {
            //напишите тут ваш код

            BufferedReader str1  = new BufferedReader(new InputStreamReader(System.in));
            String buftext = str1.readLine();
            int chislo = Integer.parseInt(buftext);
            if (chislo>0) {

                System.out.println(chislo*2);}

            else if (chislo == 0) {
                System.out.println(chislo); }

            else {

                System.out.println(chislo+1);}

        }



    }
