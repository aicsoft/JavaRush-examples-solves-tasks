package com.example.javamy.Syntax.level8;

import java.util.HashSet;
import java.util.Set;

public class level8_lekcia11_hard1 {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3


      for (Cat cat:cats){

          cats.remove(cat);
          break;
      }


        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> setCats = new HashSet<>();
        Cat cat1 =new Cat();
        Cat cat2 =new Cat();
        Cat cat3 =new Cat();
        setCats.add(cat1);
        setCats.add(cat2);
        setCats.add(cat3);
        return setCats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4

        for (Cat entry:cats){
            System.out.println(entry);
        }

    }

    // step 1 - пункт 1
    public static class Cat{

        public Cat() {
        }
    }

}

