package com.example.javamy.Syntax.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Метод в try..catch
*/


public class level9_lekcia11_nom22_method_V_try_catch {

    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {


            try {
               arrayList.add(Integer.parseInt(reader.readLine()));
            }
            catch (NumberFormatException e){
                for (Integer dig:arrayList){
                    System.out.println(dig);}
                break;

            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }
}


