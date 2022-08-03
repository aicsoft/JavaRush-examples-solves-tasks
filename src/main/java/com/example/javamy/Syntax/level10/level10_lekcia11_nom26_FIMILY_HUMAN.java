package com.example.javamy.Syntax.level10;

public class level10_lekcia11_nom26_FIMILY_HUMAN {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы

        private String name;
        private String family;
        private  int age;
        private boolean sex;
        private int height;
        private int weight;

        public Human(String name,  int age,String family, boolean sex) {
            this.name = name;
            this.family = family;
            this.age = age;
            this.sex = sex;
        }
        public Human( String family,int age,String name,int height,  boolean sex) {
            this.name = name;
            this.family = family;
            this.age = age;
            this.sex = sex;

        }
        public Human(String name, String family, boolean sex, int age) {
            this.name = name;
            this.family = family;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name,  int age, boolean sex, String family) {
            this.name = name;
            this.family = family;
            this.age = age;
            this.sex = sex;
        }




        public Human(String name, String family, int age) {
            this.name = name;
            this.family = family;
            this.age = age;
        }



        public Human(String name, String family, int age, boolean sex) {
            this.name = name;
            this.family = family;
            this.age = age;
            this.sex = sex;
        }


        public Human(String name, String family, int age, boolean sex, int height) {
            this.name = name;
            this.family = family;
            this.age = age;
            this.sex = sex;
            this.height = height;
        }


        public Human(String name, String family, int age, boolean sex, int height, int weight) {
            this.name = name;
            this.family = family;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }




        public Human(String name) {
            this.name = name;
        }


        public Human(String name, String family) {
            this.name = name;
            this.family = family;
        }



        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFamily() {
            return family;
        }

        public void setFamily(String family) {
            this.family = family;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean isSex() {
            return sex;
        }

        public void setSex(boolean sex) {
            this.sex = sex;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }






    }
}

