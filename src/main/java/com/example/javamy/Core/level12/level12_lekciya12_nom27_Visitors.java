package com.example.javamy.Core.level12;

public class level12_lekciya12_nom27_Visitors {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        String str="";


         if(o instanceof Tiger){     str="Тигр";          }

        else if(o instanceof  Lion){    str="Лев";          }
         else  if(o instanceof Cat){   str="Кот";          }

        else if(o instanceof Bull){   str="Бык";          }
        else if(o instanceof Cow){   str="Корова";          }
        else if(o instanceof Animal){   str="Животное";          }

        return str;
    }



    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }
    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}




