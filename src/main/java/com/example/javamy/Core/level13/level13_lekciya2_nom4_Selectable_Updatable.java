package com.example.javamy.Core.level13;

public class level13_lekciya2_nom4_Selectable_Updatable {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    //напишите тут ваш класс
    public class Screen implements  Selectable,Updatable{
        public  void onSelect(){}
        public  void refresh(){}
    }
}


