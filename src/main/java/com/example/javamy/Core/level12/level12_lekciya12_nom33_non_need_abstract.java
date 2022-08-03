package com.example.javamy.Core.level12;

public class level12_lekciya12_nom33_non_need_abstract {
    public static void main(String[] args) {
        Horse horse = new Pegasus();
        horse.run();
    }

    public static interface CanFly {
        public abstract void fly();
    }

    public  static  class Horse {
        public void run() {
     //       System.out.println("Бежит");
        }
    }

    public  static class Pegasus extends Horse implements CanFly {
        public  void fly() {
            System.out.println("Летит");
        }
    }

    public abstract static class SwimmingPegasus extends Pegasus {
        public abstract void swim();


    }

}










