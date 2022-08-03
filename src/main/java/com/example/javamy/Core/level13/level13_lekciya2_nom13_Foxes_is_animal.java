package com.example.javamy.Core.level13;


import javafx.scene.paint.Color;

public class level13_lekciya2_nom13_Foxes_is_animal {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
         public  Color getColor() ;
    }

    public abstract static class Fox implements  Animal {
        public String getName() {

            return "Fox";

        }

    }
}



