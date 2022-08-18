package com.example.javamy.Core.level13;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class level13_lekciya11_nom23_Read_name_file_from_console {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        StringBuilder text = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String vvod;
        do {
             vvod = br.readLine();
            bw.write(vvod+"\r\n");
        }
            while (!(vvod.equals("exit")) );

        bw.close();
        br.close();
    }
}
