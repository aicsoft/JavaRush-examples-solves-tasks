package com.example.javamy.Syntax.level6;

public class lekcia5_finalize50_000_cat_and_dog {
    public static void main(String[] args) {
        // напишите тут ваш код
        for (int i=0; i<50_000; i++){
            Cat cat = new Cat();
            Dog dog = new Dog();

    }   }
}

  class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}
  class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}




