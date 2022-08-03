package com.example.javamy.Core.level12;

public class level12_lekciya6_nom15_Cow_too_animal {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends  Animal {
        @Override
        public String getName(){return "Hello";};
    }

}

