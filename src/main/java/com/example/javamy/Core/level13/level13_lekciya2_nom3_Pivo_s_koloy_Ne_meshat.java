package com.example.javamy.Core.level13;

public class level13_lekciya2_nom3_Pivo_s_koloy_Ne_meshat {
    public static void main(String[] args) throws Exception {
        print(new Beer());
        print(new Cola());
    }

    private static void print(Drink drink) {
        System.out.println(drink.getClass().getSimpleName());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class Beer implements Drink {
        public   boolean isAlcoholic(){ return  true;}
    }

    public static class Cola implements Drink {
        public   boolean isAlcoholic(){ return  false;}
    }
}















