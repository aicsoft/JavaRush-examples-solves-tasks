package com.example.javamy.Syntax.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lekcia5_sred_arifmeticheskoe_v_massive {
    public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      int count=0;
      double summa =0;

      while (true){
          double abc = Double.parseDouble(reader.readLine());
          if (abc == -1){
              System.out.println(summa/count);
              break;
          }
          count++;
          summa=summa+abc;

      }

   }
}