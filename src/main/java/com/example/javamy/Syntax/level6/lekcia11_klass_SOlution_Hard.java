package com.example.javamy.Syntax.level6;

public class lekcia11_klass_SOlution_Hard {


    public  class Solution {


        public static void main(String[] args) {
            printIdea(new Idea());
        }

        public static void printIdea(Idea idea ){
            System.out.println(idea.getDescription());
        }

        public  static class Idea {
            public String getDescription(){
                return "любая строка";
            }
        }



    }




}
