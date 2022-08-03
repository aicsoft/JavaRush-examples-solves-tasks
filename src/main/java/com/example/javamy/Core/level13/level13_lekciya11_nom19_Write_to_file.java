package com.example.javamy.Core.level13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class level13_lekciya11_nom19_Write_to_file {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String stroka = reader.readLine();
        StringBuilder sb = new StringBuilder();
        while (true){
            if (stroka.equals("exit")){
                break;}
            else {
              sb =  sb.append(stroka).append("\n");

            }


        }
        System.out.println(sb.toString());

      //  BufferedWriter bw = new BufferedWriter(fileWay);
    }

}



