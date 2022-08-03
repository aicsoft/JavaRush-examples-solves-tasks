package com.example.javamy.Syntax.level6;

public class lekcia5_plus1_minus1_kot {
class Cat {
    public static int catCount = 0;
    public Cat (){
        catCount=catCount+1;
    }

    protected void finalize() throws Throwable{
        catCount=catCount-1;
    }

    //напишите тут ваш код

    public static void main(String[] args) {

        }

    }
}