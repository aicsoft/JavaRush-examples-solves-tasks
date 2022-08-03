package com.example.javamy.Syntax.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class level7_lekcia12_barsik {
    public final static ArrayList<Cat> CATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String name = reader.readLine();
           int dig = Integer.parseInt(reader.readLine());
            /*   String digS = Integer.toString(dig);*/ // можем скастить перед циклом а после цикла можем

            int age = Integer.parseInt(reader.readLine());
            int  weight = Integer.parseInt(reader.readLine());
// ВАЖНО до цикла если parseInt делаем не выкидывает ошибку если значение в конвертируемое значение кастится
            int  tailLength = Integer.parseInt(reader.readLine());
            if (name == null || name.isEmpty()) {
                break;
            }



// В объект мы можем вставить только переменную которую нужно приводить в объекте к нужному типу
            Cat cat = new Cat(name,age,weight,tailLength);
            CATS.add(cat);
        }

        printList();
    }

    public static void printList() {
        for (int i = 0; i < CATS.size(); i++) {
            System.out.println(CATS.get(i));
        }
    }

    public static class Cat {

        private String name;
        private int age;
        private int weight;
        private int tailLength;



        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString() {
            return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
        }
    }
}
