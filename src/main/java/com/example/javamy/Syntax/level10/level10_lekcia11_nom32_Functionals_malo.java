package com.example.javamy.Syntax.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class level10_lekcia11_nom32_Functionals_malo {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            HashMap<String,Integer> map = new HashMap<>();

                while (true) {
                    String dig = reader.readLine();
                    if ( dig.isEmpty()){break;}
                    Integer id = Integer.parseInt(dig);

                    String name = reader.readLine();
                  /*  if (name.isEmpty()) { break; }
                    else{ }*/
                    map.put(name,id);
                }
                    for (Map.Entry<String,Integer> entry1 : map.entrySet()) {
                        System.out.println(entry1.getValue() +" "+ entry1.getKey());
                    }
        }
 }



/*
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            String number = reader.readLine();
            if (number.isEmpty()) {
                break;
            }

            int id = Integer.parseInt(number);
            String name = reader.readLine();
            map.put(name, id);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
*/




/*

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            String number = reader.readLine();
            if (number.isEmpty()) {
                break;
            }

            int id = Integer.parseInt(number);
            String name = reader.readLine();
            map.put(name, id);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}

*/


