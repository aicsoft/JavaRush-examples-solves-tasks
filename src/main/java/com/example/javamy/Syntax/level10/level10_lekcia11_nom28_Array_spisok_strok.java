package com.example.javamy.Syntax.level10;

import java.util.ArrayList;

public class level10_lekcia11_nom28_Array_spisok_strok {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        ArrayList<String> list5 = new ArrayList<>();
        list1.add("Раз");
        list1.add("Два");
        list1.add("Три");
        list2.add("Раз");
        list2.add("Два");
        list2.add("Три");
        list3.add("Раз");
        list3.add("Два");
        list3.add("Три");
        list4.add("Раз");
        list4.add("Два");
        list4.add("Три");
        list5.add("Раз");
        list5.add("Два");
        list5.add("Три");
        ArrayList<String>[] array = new ArrayList[5];
        array[0] = list1;
        array[1] = list2;
        array[2] = list3;
        array[3] = list4;
        array[4] = list5;



        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}

