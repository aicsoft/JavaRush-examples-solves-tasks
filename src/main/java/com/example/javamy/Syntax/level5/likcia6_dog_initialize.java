package com.example.javamy.Syntax.level5;

public class likcia6_dog_initialize {
    class Dog {

        private String name;
        private int height;
        private String color;

        public void initialize(String name){
            this.name =name;
        }
        public  void initialize (String name, int rost){
            this.name = name;
            this.height = rost;
        }
        public  void initialize (String name, int rost, String color){
            this.name = name;
            this.height = rost;
            this.color = color;
        }


    }


}
