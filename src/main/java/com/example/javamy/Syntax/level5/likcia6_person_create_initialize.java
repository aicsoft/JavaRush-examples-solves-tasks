package com.example.javamy.Syntax.level5;

public  class likcia6_person_create_initialize {
    static class Person {
        public  String name;
        public  int age;
        public  void  initialize(String name, int age) {
            this.name = name;
            this.age = age;

        }

    }

    public static void main(String[] args) {
        Person person = new Person ();
        person.initialize("Кристофер", 31);
    }
}
