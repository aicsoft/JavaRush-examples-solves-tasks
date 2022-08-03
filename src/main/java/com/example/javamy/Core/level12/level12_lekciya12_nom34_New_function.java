package com.example.javamy.Core.level12;

public class level12_lekciya12_nom34_New_function {
    public static void main(String[] args) {
        Pegasus horse = new Pegasus();
    }

    public static interface CanFly {
        public void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly {
        public  void fly(){};
    }
}
