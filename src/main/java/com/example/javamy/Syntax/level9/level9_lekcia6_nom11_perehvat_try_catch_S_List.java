package com.example.javamy.Syntax.level9;

import java.util.ArrayList;

public class level9_lekcia6_nom11_perehvat_try_catch_S_List {
    public static void main(String[] args) {
        //напишите тут ваш код



        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
         }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("IndexOutOfBoundsException");
        }


        //напишите тут ваш код
    }
}





