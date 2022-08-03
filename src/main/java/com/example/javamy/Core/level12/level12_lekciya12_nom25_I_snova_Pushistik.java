package com.example.javamy.Core.level12;

public class level12_lekciya12_nom25_I_snova_Pushistik {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("Я - пушистик");

        System.out.println(pet.getName());
    }

    public static class Pet {
        protected String name;

        public Pet() {
        }

        public final String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Cat extends Pet {
            @Override
            public void  setName(String name) {
                this.name= "";
            }
    }
}






