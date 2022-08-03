package com.example.javamy.Syntax.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lekcia8_schitaem_index_massi_tela {


    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            double indexmassi = weight / (height * height);
            if (indexmassi < 18.5) {
                System.out.println("Недовес: меньше чем 18.5");
            }
            else if (indexmassi > 18.5 && indexmassi < 25.0) {
                System.out.println("Нормальный: между 18.5 и 25");
            }
            else if (indexmassi < 30.0 && indexmassi > 25.0) {
                System.out.println("Избыточный вес: между 25 и 30");
            }
            else if (indexmassi > 30.0) {
                System.out.println("Ожирение: 30 или больше");
            }
        }

    }

}
