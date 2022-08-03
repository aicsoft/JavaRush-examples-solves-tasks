package com.example.javamy.Syntax.level5;

public class lekcia6_koshko_initialize {
    public class Cat {
        private String name;
        private int age;
        private int weight;
        private String color;
        private String address;


        public void initializAe(String name) {
            this.name = name;
            this.age = 1;
            this.weight = 1;
            this.color = "Black";
        }

        public void initialize(String name, int weight, int age) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.color = "Black";
        }

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
            this.weight = 1;
            this.color = "Black";
        }

        public void initialize(int weight, String color) {
            this.weight = weight;
            this.color = color;
            this.age = 1;
        }

        public void initialize(int weight, String color, String address) {
            this.weight = weight;
            this.address = address;
            this.color = color;
            this.age = 1;
        }


    }


}
