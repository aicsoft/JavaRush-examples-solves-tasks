package com.example.javamy.Core.level12;

public class level12_lekciya12_nom30_interfaces_to_Human {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
    }

    public static interface Worker {
        public void workLazy();
    }

    public static interface Businessman {
        public void workHard();
    }

    public static interface Secretary {
        public void workLazy();
    }

    public static interface Miner {
        public void workVeryHard();
    }

    public static class Human implements Worker,Secretary,Businessman {

        public void workHard() {
        }

        public void workLazy() {
        }

    }

}



