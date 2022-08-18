package com.example.javamy.Core.level13;

import javafx.scene.paint.Color;

public class level13_lekciya11_nom28_One_method_in_class {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

   abstract public static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }


    }
}



