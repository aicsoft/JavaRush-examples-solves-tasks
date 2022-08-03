package com.example.javamy.Core.level13;

public class level13_lekciya11_nom16_NO_Correct_Line {
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";
    }

    interface Button extends SimpleObject {

        final String NAME = "Submit";

         void onPress();
        String onPress(Object o);

    }
}

