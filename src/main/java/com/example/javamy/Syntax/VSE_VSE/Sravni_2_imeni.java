package com.example.javamy.Syntax.VSE_VSE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sravni_2_imeni {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 =  reader.readLine();
        String name2 = reader.readLine();
      //  int c = Integer.parseInt(reader.readLine());

        if (name1.equals(name2))
        {  System.out.println("Имена идентичны");}

        else if ((!name1.equals(name2)) && (name1.length()==name2.length()))
        {  System.out.println("Длины имен равны");}

        else  if (name1!=name2) {
            //System.out.println("Имена идентичны");
             }


    }


}
