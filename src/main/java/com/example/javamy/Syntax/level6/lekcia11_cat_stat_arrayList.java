package com.example.javamy.Syntax.level6;

import java.util.ArrayList;

public class lekcia11_cat_stat_arrayList {

    public static class Cat {
        //напишите тут ваш код
        public static ArrayList<Cat> cats = new ArrayList<>();

        public Cat() {

        }

        public static void main(String[] args) {
            //напишите тут ваш код
            for ( int i = 0; i < 10 ; i++){
                cats.add(new Cat());
            }
            printCats();
        }

        public static void printCats() {
            //напишите тут ваш код
            for ( int i = 0; i < cats.size() ; i++){
                System.out.println(cats.get(i));
            }
        }


    }





}