package com.example.javamy.Syntax.VSE_VSE;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Cell_ustanovlena {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if ((a>0)&&(b>0)){  System.out.println(1);  }
        if ((a<0)&&(b>0)){  System.out.println(2);  }
        if ((a<0)&&(b<0)){  System.out.println(3);  }
        if ((a>0)&&(b<0)){  System.out.println(4);  }

    }

}