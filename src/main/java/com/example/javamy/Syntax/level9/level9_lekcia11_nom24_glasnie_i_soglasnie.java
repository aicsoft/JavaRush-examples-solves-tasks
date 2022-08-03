package com.example.javamy.Syntax.level9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class level9_lekcia11_nom24_glasnie_i_soglasnie {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        char[] ch = text.toCharArray();
        String line1 ="";
        String line2 ="";
        for (int i = 0; i < ch.length ; i++) {


          if (isVowel(ch[i])) {
              line2+=ch[i]+" ";
          }
            else  if(ch[i]!=' '){

              line1+=ch[i]+" ";
          }


        }

        System.out.println(line2);
        System.out.println(line1);



    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}

/*

    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        StringBuffer buffer1 = new StringBuffer();
        StringBuffer buffer2 = new StringBuffer();
        for (char character : string.toCharArray()) {
            if (isVowel(character)) {
                buffer1.append(character).append(" ");
            } else if (character != ' ') {
                buffer2.append(character).append(" ");
            }
        }

        System.out.println(buffer1);
        System.out.println(buffer2);
    }

    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);
        for (char vowel : vowels) {
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}




*/
