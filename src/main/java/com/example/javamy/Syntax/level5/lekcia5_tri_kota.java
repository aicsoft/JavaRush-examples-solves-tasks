package com.example.javamy.Syntax.level5;

import java.io.IOException;

public class lekcia5_tri_kota {
    public static void main(String[] args) throws IOException {
        lekcia5_sozdaem_500_kotov kot1 = new lekcia5_sozdaem_500_kotov();
        lekcia5_sozdaem_500_kotov kot2 = new lekcia5_sozdaem_500_kotov();
        lekcia5_sozdaem_500_kotov kot3 = new lekcia5_sozdaem_500_kotov();
        kot1.name = "Вася";
        kot1.age= 8;
        kot1.weight= 12;
        kot1.strength=12;

        kot2.name = "Вася";
        kot2.age= 8;
        kot2.weight= 12;
        kot2.strength=12;

        kot3.name = "Вася";
        kot3.age= 8;
        kot3.weight= 12;
        kot3.strength=12;

        /* ЭТО ПРАИВЛЬНЫЙ ВАРИАНТ НА АНДРОИДЕ


        Cat kot1 = new Cat("Вася ",8,12,6);
        Cat kot2 = new Cat("Дон",6,10,8);
        Cat kot3 = new Cat("Сэм",4,14,4);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;  }*/




    }
}
