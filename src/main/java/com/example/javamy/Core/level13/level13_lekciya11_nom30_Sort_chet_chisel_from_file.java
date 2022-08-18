package com.example.javamy.Core.level13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class level13_lekciya11_nom30_Sort_chet_chisel_from_file {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String read = reader.readLine();
        Scanner scanner = new Scanner(read);
        ArrayList list = new ArrayList();

        if (scanner.hasNextLine()) {
           list.add(Integer.parseInt(scanner.nextLine()));
        }

        System.out.println(list.toString());

//        for (int i = 0; i <list.size() ; i++) {
//            for (int j = 0; j < list.size(); j++) {
//                if (list[i]>list.get(j)){
//                    int d = list.get(j);
//                    list.get(i) = list.get(j);
//                    list.get(j) = d;
//
//                }
//            }
//        }


    }
}
