package com.example.javamy.Core.level12;

public class level12_lekciya9_nom20_CanFly_Run_MOVE {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements  CanEat,CanMove {

        public void move(){};
        public void eat(){};
    }

    public class Duck implements CanFly, CanEat,CanMove {
        public void fly(){};
        public void move(){};
        public void eat(){};
    }

    public class Car implements CanMove {

        public void move(){};

    }

    public class Airplane implements CanFly,CanMove {
        public void fly(){};
        public void move(){};

    }
}




