package com.javarush.task.task05.task0501;

/* 
Создание кота
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public static void main(String[] args) { 
        Cat cat = new Cat();
        cat.name = "vaska";
        cat.age = 3;
        cat.weight = 5;
        cat.strength = 13;
    }
}
