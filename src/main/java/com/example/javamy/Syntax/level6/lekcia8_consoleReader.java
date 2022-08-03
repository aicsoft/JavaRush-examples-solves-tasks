package com.example.javamy.Syntax.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lekcia8_consoleReader {

        public class ConsoleReader {
                        public static String readString() throws Exception {
                            //напишите тут ваш код
                            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                            return  reader.readLine();

                        }

                        public static int readInt() throws Exception {
                            //напишите тут ваш код
                            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                            int digit = Integer.parseInt(reader.readLine());
                            return digit;
                        }

                        public static double readDouble() throws Exception {
                            //напишите тут ваш код
                            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                            double digitdobi = Double.parseDouble(reader.readLine());
                            return digitdobi;

                        }

                        public static boolean readBoolean() throws Exception {
                            //напишите тут ваш код
                            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                            boolean digitbool = Boolean.parseBoolean(reader.readLine());
                            return digitbool;

                        }

                        public static void main(String[] args) throws Exception {

                         }
        }

}
