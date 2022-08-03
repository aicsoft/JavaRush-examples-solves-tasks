package com.example.javamy.Syntax.VSE_VSE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vozrast20 {


        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name =  reader.readLine();
            int c = Integer.parseInt(reader.readLine());
            if (c>20) {
                System.out.println("И 18-ти достаточно");
            }
           else  if (c<=20) {
                /*System.out.println("И 18-ти достаточно");*/
            }
}

}




