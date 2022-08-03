package com.example.javamy.Syntax.level8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class level8_lekcia8_bolshe_10_ne_podhodite {

    public static Set<Integer> createSet() {
        // напишите тут ваш код
         Set<Integer> set = new HashSet();
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        set.add(22);
        set.add(332);
        set.add(443);
        set.add(534);
        set.add(632);

        set.add(12);
        set.add(31);
        set.add(42);
        set.add(25);
        set.add(33);

        set.add(26);
        set.add(32);
        set.add(44);
        set.add(55);
        set.add(63);
        return set;


    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
// ТОЖ ВАЖНО Iterator
      Iterator<Integer> iter= set.iterator();
      while (iter.hasNext()){
          //int dig = iter.next();

          if (iter.next()>10){

              iter.remove();

          }
      }

        return  set;
    }

    public static void main(String[] args) {
      Set<Integer> set = createSet();
       removeAllNumbersGreaterThan10(set);
        for (Integer entry:set){
            System.out.println(entry);




    }


}
}
