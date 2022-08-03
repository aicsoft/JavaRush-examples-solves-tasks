package com.example.javamy.Core.level12;

public class level12_lekciya12_nom26_Nevedoma_zverushka {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        String ss ="";
        if (o instanceof Cat){ ss="Кот";          }
        else if (o instanceof Tiger){   ss="Тигр";       }
        else if (o instanceof Lion){  ss="Лев";        }
        else if (o instanceof Bull){     ss="Бык";     }
        else if (o instanceof Object){ ss="Животное";         }

        return ss;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}


