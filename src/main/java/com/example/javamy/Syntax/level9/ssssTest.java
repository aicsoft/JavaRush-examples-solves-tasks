package com.example.javamy.Syntax.level9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ssssTest {

///// Прочитать текст чтения текста из файла

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\sam\\Desktop\\Java.txt"));

            for (int i = 0; i<200; ++i) {
                if (reader!=null){
                    String firstString = reader.readLine();
                    //  String firstString = reader.readLine();
                    System.out.println(firstString);

                }
                else { reader.close();
                    break;}
            }
      //      String firstString = reader.readLine();
         //   System.out.println(firstString);
        }

}
