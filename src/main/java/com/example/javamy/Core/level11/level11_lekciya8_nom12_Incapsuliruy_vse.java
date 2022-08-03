package com.example.javamy.Core.level11;

public class level11_lekciya8_nom12_Incapsuliruy_vse {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private  int age;
        private int weight;
        private  int speed;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;

        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setWeight(int weight) {
            this.weight = weight;

        }

        public void setSpeed(int speed) {
            this.speed = speed;

        }
    }
}
