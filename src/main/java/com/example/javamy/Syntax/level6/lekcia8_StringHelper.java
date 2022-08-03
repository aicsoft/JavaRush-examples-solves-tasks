package com.example.javamy.Syntax.level6;

public class lekcia8_StringHelper {

    public static class StringHelper {




        public static String multiply(String text) {



            return multiply(text, 5);
        }

        public static String multiply(String text, int count) {
            String result = "";


                for (int i =0; i<count; i++){
                    result=result +text;
                    System.out.println(result +text);
                }

            return  result;

        }


    }


    public static void main(String[] args) {

    }



}
