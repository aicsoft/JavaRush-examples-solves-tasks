package com.example.javamy.Syntax.level7;
// ВАЖНО ЗАПОМНИТЬ
// в комменты смотри
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class level7_lekcia12_perestanovka_strok {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        ArrayList<String> list=new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i <M; i++) {
         //   String s = list.get(i);
            //   list.add(list.get(i));   ВАЖНО ТАК ДЕЛАТЬ НЕЛЬЗЯ
          //  list.add(s);
           // list.remove(0);
           list.add(list.remove(0)); //  ВАЖНО так можно
         }


        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));

        }

    }
}
