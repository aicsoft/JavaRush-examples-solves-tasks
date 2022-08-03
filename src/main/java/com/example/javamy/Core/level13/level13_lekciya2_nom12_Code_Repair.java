package com.example.javamy.Core.level13;

public class level13_lekciya2_nom12_Code_Repair {
    public static void main(String[] args) throws Exception {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public  static class Translator {
        public String translate() {
            return "Я переводчик с английского";
        }
    }


}

