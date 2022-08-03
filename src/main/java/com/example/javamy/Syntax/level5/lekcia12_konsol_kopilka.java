package com.example.javamy.Syntax.level5;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class lekcia12_konsol_kopilka {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        int digit=0;
        int summa=0;


            while (true) {

                String stroka = reader.readLine();


                if (stroka.equals("сумма")) {
                    break;
                }
                else { digit = Integer.parseInt(stroka);}


                summa = summa + digit;

            }

      /*    catch (NumberFormatException e) {
              System.out.println(summa);
        }

        finally {
            System.out.println(summa);

        }*/

        System.out.println(summa);



    }




}


