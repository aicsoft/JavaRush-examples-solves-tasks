package com.example.javamy.Core.level12;

public class level12_lekciya12_nom23_Vse_nemnogo_Koshki {
    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "Я - пушистик";
        }
    }

    public static class Cat extends Pet {
        @Override
        public String getName(){
            return "Я - кот";
        }

    }
}


