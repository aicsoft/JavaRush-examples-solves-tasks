package com.example.javamy.Core.level12;

public class level12_lekciya12_nom31_parent_class_CTO {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
         void workHard();

    }

    public static class CTO  extends/* Businessman.*/GlavSTO implements Businessman {

    }

    public  static class GlavSTO{
        public void workHard(){}
    }
  public class Stor{     }
}

/*
Родитель класса CTO
*/

/*
public class Solution {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static class Worker {
        public void workHard() {
        }
    }

    public interface Businessman {
        void workHard();
    }

    public static class CTO extends Worker implements Businessman {

    }
}     */
