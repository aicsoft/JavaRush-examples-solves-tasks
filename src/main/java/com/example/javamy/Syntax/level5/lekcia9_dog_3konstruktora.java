package com.example.javamy.Syntax.level5;

public class lekcia9_dog_3konstruktora {
    class Dog{
        private String name;
        private int height;
        private String color;

        public Dog (String name){
            this.name =name;
        }
        public  Dog (String name, int height){
            this.name = name;
            this.height = height;
        }
        public  Dog (String name, int height, String color){
            this.name = name;
            this.height = height;
            this.color = color;
        }

    }
}
