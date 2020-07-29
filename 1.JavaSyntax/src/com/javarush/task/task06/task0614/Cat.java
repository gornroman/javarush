package com.javarush.task.task06.task0614;

/* 
Статические коты
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<>();
    public Cat() {
//        cats.add(this);
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cats.add(cat1);
        Cat cat2 = new Cat();

        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        cats.add(cat6);
        cats.add(cat7);
        cats.add(cat8);
        cats.add(cat9);
        cats.add(cat10);
        printCats();
    }

    public static void printCats() {
        cats.forEach(System.out::println);
    }
}
