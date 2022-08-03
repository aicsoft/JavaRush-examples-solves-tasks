package com.example.javamy.Syntax.level10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class level10_lekcia11_nom29_Twins_Words {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<>();

        for(String str:list){
            if (!(result.containsKey(str))){
                result.put(str,1);
            }
            //  else {System.out.println(" такое слово уже есть в базе");}
             else {
                for (Map.Entry<String, Integer> entry: result.entrySet()){
                    if (str.equals(entry.getKey())){
                       int val= entry.getValue();
                       entry.setValue(val+1);
                    }
                }
             }
        }
        //напишите тут ваш код
        return result;
    }

}


