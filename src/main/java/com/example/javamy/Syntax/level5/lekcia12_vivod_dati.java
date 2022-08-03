package com.example.javamy.Syntax.level5;

public class lekcia12_vivod_dati {
    public static class Datasegonda{
        int day;
        int month;
        int Year;

        public Datasegonda(int day, int month, int year) {
            this.day = day;
            this.month = month;
            Year = year;
        }
    }

    public static void main(String[] args) {
        Datasegonda date = new Datasegonda(19,04,2022);
        System.out.println(date.day+" "+ date.month+" "+ date.Year);

    }
}
