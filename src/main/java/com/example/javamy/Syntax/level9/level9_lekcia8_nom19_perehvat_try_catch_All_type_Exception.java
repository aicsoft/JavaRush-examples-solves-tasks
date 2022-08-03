package com.example.javamy.Syntax.level9;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class level9_lekcia8_nom19_perehvat_try_catch_All_type_Exception {
    public static void main(String[] args) {
    }

    static class MyException extends  NullPointerException{
    }

    static class MyException2 extends  ArithmeticException {
    }

    static class MyException3 extends FileNotFoundException {
    }

    static class MyException4 extends URISyntaxException {
        public MyException4(String input, String reason, int index) {
            super(input, reason, index);
        }

        public MyException4(String input, String reason) {
            super(input, reason);
        }
    }
}

//NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException