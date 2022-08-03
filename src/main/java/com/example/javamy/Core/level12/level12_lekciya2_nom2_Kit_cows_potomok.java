package com.example.javamy.Core.level12;

public class level12_lekciya2_nom2_Kit_cows_potomok {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {
            @Override
            public String getName(){
                return "";
            }

    }
}

