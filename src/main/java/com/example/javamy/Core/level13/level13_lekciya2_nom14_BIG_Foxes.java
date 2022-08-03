package com.example.javamy.Core.level13;

import javafx.scene.paint.Color;

public class level13_lekciya2_nom14_BIG_Foxes {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());

    }

    public interface Animal {
        public Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox {
        public Color Color() {
            return Color.GRAY;
        }
        public Color getColor(){return null;}
    }

}

