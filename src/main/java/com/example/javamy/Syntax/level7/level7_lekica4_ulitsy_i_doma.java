package com.example.javamy.Syntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level7_lekica4_ulitsy_i_doma {

    public static void main(String[] args) throws IOException {
        int[] array = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<array.length; i++){
            array[i]=Integer.parseInt(reader.readLine());
        }
        int summaCheat=0;
        int summaHatchet=0;
        for (int i=0; i< 15; i++){
            if (i%2==0){ summaCheat+=array[i];}

            else{ summaHatchet+=array[i];}
        }
        //  System.out.println(summaCheat);
        //  System.out.println(summaHatchet);


        if (summaCheat > summaHatchet){
            System.out.println( "В домах с четными номерами проживает больше жителей." ); }
        else if (summaCheat == summaHatchet){}


 else {
                System.out.println ("В домах с нечетными номерами проживает больше жителей.");

            }
        }

    }





//        System.out.println(summaChet);
//        System.out.println(summaNechet);

//        "В домах с нечетными номерами проживает больше жителей."
//        "В домах с четными номерами проживает больше жителей."