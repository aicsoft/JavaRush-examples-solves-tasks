package com.example.javamy.Core.level13;

import javafx.scene.paint.Color;

public class level13_lekciya11_nom29_Kompilation_programs {
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox() {
            @Override
            public Color getColor() {
                return null;
            }
        };
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

 abstract    public static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public abstract static class BigFox extends Fox{

    }

}



