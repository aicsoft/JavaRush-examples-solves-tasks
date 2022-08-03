package com.example.javamy.Syntax.level5;

public class likcia9_kot_s_5_konstruktorami {
    class Cat {
       public String name;
       public String address;
      public   String color;
        public int age;
       public int weight;

        public Cat (String name){
            this.name=name;
            this.color="Red";
            this.age = 5;
            this.weight= 6;
        }

        public Cat (String name,  int age, int weight){
            this.name=name;
            this.age = age;
            this.weight= weight;
            this.color="Blue";
        }

        public Cat (int age, String name ) {
            this.name=name;
            this.age = age;
            this.color="Yellow";
            this.weight=6;
        }

        // норм
        public Cat (String color, int weight){
            this.weight= weight;
            this.color=color;
            this.age = 22;

        }
        public Cat (String color, int weight, String address){
            this.color=color;
            this.weight= weight;
            this.address = address;
            this.age = 142;
        }


    }
}
