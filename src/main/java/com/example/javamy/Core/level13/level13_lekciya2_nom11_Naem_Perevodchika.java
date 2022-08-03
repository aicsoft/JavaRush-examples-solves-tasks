package com.example.javamy.Core.level13;

public class level13_lekciya2_nom11_Naem_Perevodchika {
    public static void main(String[] args) throws Exception {
        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());
    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {
            return "Я переводчик с " + getLanguage();
        }
    }

    public static class EnglishTranslator extends  Translator{
      public String getLanguage(){ return "английского";}
    }

}





