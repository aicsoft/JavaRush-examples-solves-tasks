package com.example.javamy.Core.level12;

public class level12_lekciya6_nom16_Cats_not_abstract {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        public  String getName(){return " hello";}

        public  Pet getChild(){

            return  null; }

    }

    public static class Dog extends Pet {
        public  String getName(){return " hello";}

        public  Pet getChild(){

            return  null; }

    }

}




