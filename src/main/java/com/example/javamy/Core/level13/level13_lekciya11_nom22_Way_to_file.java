package com.example.javamy.Core.level13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class level13_lekciya11_nom22_Way_to_file {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String put = reader.readLine();
        FileInputStream fway = new FileInputStream(put);
        StringBuilder text = new StringBuilder();
        char ch ;
        while (fway.read()> -1) {
            ch =(char) fway.read();
            System.out.print(ch);
          // text =  text.append(fway.readAllBytes());
        }
   ///     System.out.println(text.toString());
        reader.close();
        fway.close();
    }
}
