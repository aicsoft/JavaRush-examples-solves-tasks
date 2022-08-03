package com.example.javamy.Syntax.level5;

public class lekcia12_man_woman {
    public static class  Man {
        public Man(String name) {
            this.name = name;
            this.age = 0;
            this.address = null;
        }

        public Man(String name, int age) {
            this.name = name;
            this.age = 0;
            this.address = null;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public  String name;
        public  int age;
        public  String address;

    }

    public static class  Woman {
        public Woman(String name) {
            this.name = name;
            this.age = 0;
            this.address = null;
        }

        public Woman(String name, int age) {
            this.name = name;
            this.age = 0;
            this.address = null;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public  String name;
        public  int age;
        public  String address;


    }

    public static void main(String[] args) {
        Man man1 = new Man("Даня",32,"Мегас");
        Man man2 = new Man("Даня2",322,"Мегас2");
        Woman woman1 = new Woman("Ева",18,"Эдем");
        Woman woman2 = new Woman("Инга",22,"Стограмм");
        System.out.println(woman1.name+" "+woman1.age+" "+woman1.address);
        System.out.println(woman2.name+" "+woman2.age+" "+woman2.address);
        System.out.println(man1.name+" "+man1.age+" "+man1.address);
        System.out.println(man2.name+" "+man2.age+" "+man2.address);
    }







}
