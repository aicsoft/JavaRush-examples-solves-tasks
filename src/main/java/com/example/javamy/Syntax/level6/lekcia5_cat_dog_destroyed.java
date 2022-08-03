package com.example.javamy.Syntax.level6;

public class lekcia5_cat_dog_destroyed {
    public class Cat {
        public static void main(String[] args) {

        }

        //напишите тут ваш код
        protected void finalize() throws Throwable{
         System.out.println("A Cat was destroyed"); }
    }

    class Dog {
        //напишите тут ваш код
        protected void finalize() throws Throwable{
            System.out.println  ("A Dog was destroyed"); }
    }



}
