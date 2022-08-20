package com.example.javamy.Core.level13._30_REPKA;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class level13_lekciya11_nom30_Sort_chet_chisel_from_file {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String read = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(read);
        Scanner scanner = new Scanner(fileInputStream);

        ArrayList<Integer> list = new ArrayList<>();
        while(scanner.hasNextLine()) {
            int dig = Integer.parseInt(scanner.nextLine());
            if (dig%2 ==0) {
                list.add(dig);
            }
        }

        Collections.sort(list);
        for(Integer d:list){
            System.out.println(d);
        }

        fileInputStream.close();
        scanner.close();
        reader.close();
    }
}







/*

import java.io.BufferedReader;
        import java.io.FileInputStream;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        import java.util.Scanner;

*/
/*
Сортировка четных чисел из файла
*//*


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        Scanner scanner = new Scanner(new FileInputStream(sourceFileName));

        List<Integer> data = new ArrayList<>();
        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            if (value % 2 == 0) data.add(value);
        }

        Collections.sort(data);
        for (Integer value : data) {
            System.out.println(value);
        }

        scanner.close();
    }
}


*/





















