package com.example.javamy.Core.level12;

public class level12_lekciya12_nom29_Can_Fly_Swim_Run {
    public static void main(String[] args) {
    //    Duck as = new Duck();

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public class Duck implements CanFly,CanRun,CanSwim {
        public void fly() {        }
        public void swim() {        }
        public void run() {        }

    }

    public class Penguin implements CanRun,CanSwim {

        public void swim() {        }
        public void run() {        }
    }

    public class Toad implements CanSwim {
        public void swim() {        }
    }
}




