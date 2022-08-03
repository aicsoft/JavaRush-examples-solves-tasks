package com.example.javamy.Syntax.level6;

public class lekcia8_static_int_catCount_plus2metoda {

    public class Cat {
        private static int catCount = 0;

        public Cat() {
            catCount++;
        }

        public static int getCatCount() {
            //напишите тут ваш код
            return catCount;

        }

        public static void setCatCount(int catCount) {
            //напишите тут ваш код
            Cat.catCount = catCount;

        }

        public static void main(String[] args) {

        }


    }

}