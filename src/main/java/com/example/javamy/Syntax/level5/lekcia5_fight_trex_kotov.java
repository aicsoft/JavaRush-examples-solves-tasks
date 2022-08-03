package com.example.javamy.Syntax.level5;

import java.io.IOException;

public class lekcia5_fight_trex_kotov {
    public static void main(String[] args) throws IOException {

            //напишите тут ваш код          //ПРАВИЛЬНО РЕШИЛ

            Cat kot1 = new Cat("Вася ",8,12,6);
            Cat kot2 = new Cat("Дон",6,10,8);
            Cat kot3 = new Cat("Сэм",4,14,4);
            System.out.println (kot1.fight(kot2));
            System.out.println (kot2.fight(kot3));
            System.out.println (kot3.fight(kot1));

        }

        public static class Cat {

            protected String name;
            protected int age;
            protected int weight;
            protected int strength;

            public Cat(String name, int age, int weight, int strength) {
                this.name = name;
                this.age = age;
                this.weight = weight;
                this.strength = strength;
            }

            public boolean fight(Cat anotherCat) {
                int ageScore = Integer.compare(this.age, anotherCat.age);
                int weightScore = Integer.compare(this.weight, anotherCat.weight);
                int strengthScore = Integer.compare(this.strength, anotherCat.strength);

                int score = ageScore + weightScore + strengthScore;
                return score > 0; // return score > 0 ? true : false;
            }
        }

}
