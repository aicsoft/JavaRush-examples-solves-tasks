package com.example.javamy.Syntax.level5;

import java.io.IOException;

public class lekcia12_dog_cat_mouse {
    public static void main(String[] args) throws IOException {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat kotikTom = new Cat("Tom",6,7);
        Dog dogSam = new Dog("Sam",12,15);

    }
    public static class Dog {
        String name;
        int height;
        int tail;
        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }

    }


    public static class Cat {
        String name;
        int height;
        int tail;
        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }



    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }


}
