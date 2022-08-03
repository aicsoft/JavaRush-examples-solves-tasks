package com.example.javamy.Core.level12;

public class level12_lekciya9_nom22_Human_Run_Swim {
    public static void main(String[] args) {




    }

    //add public interfaces and a public class here - добавь public интерфейсы и public класс тут

    public  abstract class Human implements CanRun,CanSwim{

    }

    interface CanRun{
        public void canRun();
    }

    interface CanSwim{
    public void swim();
    }


}
