package com.example.javamy.Syntax.level5;

public class lekcia5_fight_kotov {

    public class Cat{
        String name;
        int age;
        int weight;
        int strength;

        public Cat (){}

        public  boolean fight (Cat anotherCat) {
        int ageScore = Integer.compare(this.age,anotherCat.age);
        int weightScore = Integer.compare(this.weight, anotherCat.weight);
        int strengthScore = Integer.compare(this.strength, anotherCat.strength);


        int Score = ageScore+weightScore+strengthScore;
        return Score>0;

        }
   }

    public static void main(String[] args) {



    }
}
