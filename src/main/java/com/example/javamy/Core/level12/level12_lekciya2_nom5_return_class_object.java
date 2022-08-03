package com.example.javamy.Core.level12;

public class level12_lekciya2_nom5_return_class_object {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //Напишите тут ваше решение
        String s="";
           if (o instanceof Cow){
               s= "Корова";}
        else if (o instanceof Dog){
               s=  "Собака";}
        else if (o instanceof Whale){
               s=  "Кит";}
        else if (o instanceof Pig){
               s= "Неизвестное животное";}

        return s;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}



