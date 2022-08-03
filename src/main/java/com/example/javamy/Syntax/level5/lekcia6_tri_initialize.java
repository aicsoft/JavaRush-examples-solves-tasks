package com.example.javamy.Syntax.level5;

public class lekcia6_tri_initialize {
    public class Friend{

        /// ТУТ Я ПРАВИЛЬНО ИНИЦИАЛИЗИРОВАЛ ПОЛЯ
        private String name;
        private int age;
        private char sex;

        public void initialize(String name){
            this.name=name;
        }
        public void initialize(String name, int age){
            this.name = name;
            this.age = age;
        }
        public void initialize(String name, int age, char sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }




    public static void main(String[] args) {

    }

    }
}
