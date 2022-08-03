package com.example.javamy.Syntax.level9;

public class Primer_Raboti_Super_i_This {

//   ПРИМЕР РАБОТЫ конструктора super() и this()
//  super() - вызывает экземпляр родительского объекта, пример - конструктор
//  this()  - вызывает текущий экземпляр объекта.

    static  class A{

        A(){
            System.out.println("Конструктор без аргументов класса A");
        }

        A(String args){
            System.out.println("Конструктор с одним аргументом класса A РАз");
        }
    }

    static class B extends A{

        B(){
            this(""); // вызов конструктора с одним аргументом класса B
            System.out.println("Конструктор без аргументов класса B ХУЙ");
        }

        B(String args){
            super(""); // вызов конструктора с одним аргументом класса A
            System.out.println("Конструктор с одним аргументом класса B ДВА");
        }
    }

    /////////
    public static void main(String args[]) {
        B b = new B();
    }


    // Тест-класс и вывод
    public class Test {


    }

}
