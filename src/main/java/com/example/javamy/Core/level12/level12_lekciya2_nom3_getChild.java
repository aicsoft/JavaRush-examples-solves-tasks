package com.example.javamy.Core.level12;

public class level12_lekciya2_nom3_getChild {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();
    }

    public static class Pet {
        public Pet getChild() {
            return new Pet();
        }
    }

    public static class Cat extends Pet {
        @Override
        public Cat getChild() {
            return new Cat();
        }

    }

    public static class Dog extends Pet {
        @Override
        public Dog getChild() {
            return new Dog();
        }

    }
}



