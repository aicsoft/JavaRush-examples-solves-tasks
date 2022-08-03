package com.example.javamy.Core.level12;

public class level12_lekciya9_nom21_Create_Human {
    public static void main(String[] args) {

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


    public class Human implements CanRun ,CanSwim {
        public void run(){};
        public void swim(){};
    }

    public class Duck  implements CanFly,CanRun ,CanSwim{
        public void run(){};
        public void swim(){};
        public void fly(){};
    }

    public class Penguin implements CanRun ,CanSwim{
        public void run(){};
        public void swim(){};
    }

    public class Airplane implements CanFly {
        public void fly(){};
    }
}





