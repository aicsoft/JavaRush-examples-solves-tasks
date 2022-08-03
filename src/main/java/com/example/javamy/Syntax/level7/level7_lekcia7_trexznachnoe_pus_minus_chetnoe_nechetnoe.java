package com.example.javamy.Syntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level7_lekcia7_trexznachnoe_pus_minus_chetnoe_nechetnoe {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String cifr_simvol= reader.readLine();
        int cifr = Integer.parseInt(cifr_simvol);
        if ((cifr>0)&&(cifr<=999)){
            if ((cifr_simvol.length()==3)&&(cifr%2==0) ){ System.out.println("четное трехзначное число");}
        else    if ((cifr_simvol.length()==3)&&(cifr%2>0 )){ System.out.println("нечетное трехзначное число");}
        else    if ((cifr_simvol.length()==2) &&(cifr%2==0)){ System.out.println("четное двузначное число");}
        else    if ((cifr_simvol.length()==2) &&(cifr%2>0)){ System.out.println("нечетное двузначное число");}
        else    if ((cifr_simvol.length()==1) &&(cifr%2==0)){ System.out.println("четное однозначное число");}
        else    if ((cifr_simvol.length()==1)&&(cifr%2>0 )){ System.out.println("нечетное однозначное число");}
        }


    /*  if (cifr_simvol.length()>0 ){
          System.out.println(cifr_simvol.length());}*/


       /* "нечетное двузначное число"
        "нечетное однозначное число"
        "нечетное трехзначное число"
        "четное двузначное число"
        "четное однозначное число"
        "четное трехзначное число"    */
    }

}
