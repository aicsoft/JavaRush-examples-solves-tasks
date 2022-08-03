package com.example.javamy.Core.level12;

public class level12_lekciya12_nom28_lazat_run_Fly {

    public static void main(String[] args) {

    }

    public class Tiger extends Cat { // Тигр он усовершенствованный Кот, ему не нужно имплементировать интерфейсы,
        // Кот за него имплементировал за него методы интерфейсов и реализовал их.
     //   public void run(){}
      //  public void  climb(){}
    }


    public class Cat implements CanClimb,CanRun{
        public void run(){}
        public void  climb(){}
    }

    public class Dog implements CanRun {
        public void run() {
        }
    }

    public class Duck implements CanRun,CanFly{
        public void run(){}

        public  void fly(){}
    }

   public  interface CanFly{
        void fly();
    }

    public  interface CanRun{
        void run();
    }

    public  interface CanClimb{
        void  climb();
    }

}













