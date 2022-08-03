package com.example.javamy.Syntax.level8;

import java.util.HashSet;
import java.util.Set;

public class level8_lekcia11_hard2_mnogo_animals {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> setCats = new HashSet<Cat>();
        Cat cat1 =new Cat();
        Cat cat2 =new Cat();
        Cat cat3 =new Cat();
        Cat cat4 =new Cat();
        setCats.add(cat1);
        setCats.add(cat2);
        setCats.add(cat3);
        setCats.add(cat4);
        return setCats;


    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> dogSet = new HashSet<Dog>();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dogSet.add(dog1);
        dogSet.add(dog2);
        dogSet.add(dog3);

        return dogSet;
    }


// ВАЖНО для объединения коллекций разных типов создается коллекция Object и через метод addAll добавляем те коллекции
    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
       Set<Object> pets = new HashSet<>();
       pets.addAll(cats);
       pets.addAll(dogs);

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object pet:pets){
            System.out.println(pet);
        }
    }

    //напишите тут ваш код
public  static class Cat{
        public Cat() {
        }
    }

    public  static class Dog{
        public Dog() {
        }
    }

}

