package com.example.javamy.Syntax.level10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class level10_lekcia11_nom25_Count_bukv {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 1; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        // напишите тут ваш код
        //////////////////////////
        HashMap<Character, Integer> alfaOutput = new HashMap<>();
        for (int i = 0; i <alphabet.size() ; i++) {
            int Digit=0;
            alfaOutput.put(alphabet.get(i),Digit);

        }





        for (int i = 0; i < list.size() ; i++) { // 1 slovo
                char[] lines = list.get(i).toLowerCase().toCharArray();
                        for (int j = 0; j < lines.length; j++) {   // bukv v slove
                            for (Map.Entry<Character,Integer> entry: alfaOutput.entrySet()){ // 33 bukv
                                //for (int l = 0; l < alphabet.size() ; l++) { } // 33 v alfavite
                                        if (lines[j]== entry.getKey()){
                                            //  System.out.println(lines[j]== entry.getKey());
                                        //    System.out.println(entry.getValue());
                                            alfaOutput.put( lines[j], entry.getValue()+1);
                                     }
                             }
                        }
        }

        for (int i = 0; i <alphabet.size() ; i++) {
            for (Map.Entry<Character,Integer> entry: alfaOutput.entrySet() ){
                if (alphabet.get(i)==entry.getKey()){
                    System.out.println(entry.getKey()+" "+ entry.getValue());
                }
            }

        }



       /* for (Map.Entry <Character, Integer> str: alfaOutput.entrySet()){
            System.out.println(str.getKey()+" "+str.getValue());

        }*/


        //////////////////////////
    }
}



