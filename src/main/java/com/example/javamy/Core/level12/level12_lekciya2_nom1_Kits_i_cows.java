package com.example.javamy.Core.level12;

public class level12_lekciya2_nom1_Kits_i_cows {
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
        public String getName() {
            return "Я не корова, Я - кит.";
        }
    }
}


