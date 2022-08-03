package com.example.javamy.Syntax.level9;

import java.util.ArrayList;

public class level9_lekcia11_nom27_ArrayList_intArray {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> listNew = new ArrayList<>();
        listNew.add(new int[5]);
        listNew.add(new int[2]);
        listNew.add(new int[4]);
        listNew.add(new int[7]);
        listNew.add(new int[0]);
        return listNew;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}







