package com.example.javamy.Core.level13;

public class level13_lekciya2_nom9_All_that_move {
    public static void main(String[] args) throws Exception {
    }

    public interface CanMove{
        public Double speed();
    }

    public interface CanFly extends CanMove{

        public  Double speed(CanFly canFly);
    }
}
