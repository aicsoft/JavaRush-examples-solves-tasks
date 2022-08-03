package com.example.javamy.Core.level11;

public class level11_lekciya8_nom10_nepristupniy_Kot {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

          public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }



            private void setName(String name) {
                this.name = name;
            }

            private void setAge(int age) {
                this.age = age;
            }
        }
    }




