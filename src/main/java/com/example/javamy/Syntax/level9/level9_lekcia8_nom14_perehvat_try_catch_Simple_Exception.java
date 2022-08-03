package com.example.javamy.Syntax.level9;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class level9_lekcia8_nom14_perehvat_try_catch_Simple_Exception {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
try {
    method1();
}  catch (NullPointerException|FileNotFoundException e ){
    System.out.println(e.getMessage());
}


        //напишите тут ваш код
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0) {   throw new NullPointerException(); }


       else if (i == 1) { throw new ArithmeticException(); }



        else if (i == 2) {    throw new FileNotFoundException();  }
        else if (i == 3) {  throw new URISyntaxException("", "");  }

    }
}


