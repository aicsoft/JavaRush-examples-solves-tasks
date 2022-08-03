package com.example.javamy.Syntax.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lekcia13_for_pryamougolnik {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String cifr_simvol= reader.readLine();
        int m= Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

      /* int m=2;
        int n=4;*/
        for (int i=1; i<=m;i++){

            for(int j=1; j<=n; j++){
                System.out.print("8");

            }
            System.out.println("");
        }
   }

}
