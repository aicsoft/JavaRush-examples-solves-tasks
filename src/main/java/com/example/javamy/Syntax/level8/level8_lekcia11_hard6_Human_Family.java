package com.example.javamy.Syntax.level8;

import java.util.ArrayList;

public class level8_lekcia11_hard6_Human_Family {

    public static void main(String[] args) {
        //напишите тут ваш код
        Human vnuk1=new Human("Саня1",23,true, new ArrayList<>());
        Human vnuk2=new Human("Саня2",25,true, new ArrayList<>());
        Human vnuk3=new Human("Саня3",29,true, new ArrayList<>());

        ArrayList <Human> children = new ArrayList<>();
        children.add(vnuk1);
        children.add(vnuk2);
        children.add(vnuk3);


        Human mama=new Human("Мама",48,false,children);
        Human papa=new Human("Папа",49,true,children);

        ArrayList <Human> children2 = new ArrayList<>();
        children2.add(mama);

        ArrayList <Human> children4 = new ArrayList<>();
        children4.add(papa);


        Human ded1=new Human("Дед1",86,true,children2);
        Human baba1=new Human("Бабушка1",76,false,children2);

        Human ded2=new Human("Дед2",78,true,children4);
        Human baba2=new Human("Бабушка",88,false,children4);

        ArrayList <Human> children3 = new ArrayList<>();
        children3.add(ded1);
        children3.add(ded2);
        children3.add(baba1);
        children3.add(baba2);


//        System.out.println(children.toString());
//        System.out.println(children2.toString());
//        System.out.println(children3.toString());
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(baba1);
        System.out.println(baba1);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(vnuk1);
        System.out.println(vnuk2);
        System.out.println(vnuk3);
    }

    public static class Human {


        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        //напишите тут ваш код
        String name;
        int age;
        boolean sex;
       ArrayList <Human> children;

        public Human(String name, int age, boolean sex, ArrayList <Human> children) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children =  children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0 ) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }

            }

            return text;
        }
    }
}




