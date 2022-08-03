package com.example.javamy.Core.level13;

public class level13_lekciya2_nom7_pARAMETRIZED_iNTERFce {
    public static void main(String[] args) throws Exception {

    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String>
            //допишите здесь ваш код
    {
       public SimpleObject<String> getInstance(){ return null;}
    }
}


//// ОРИГИНАЛЬНОЕ РЕШЕНИЕ
/*
Параметризованый интерфейс
*/
/*

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String> {
        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
}    */
