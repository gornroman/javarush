package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {

    public String name;
    public int age;
    public int weight;
    public String address;
    public String color;

    public Cat(String name)
    {
        this.name = name;
        this.age = 1;
        this.weight = 1;
        this.color = "black";
    }

    public Cat(String name, int weight, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "black";
    }

    public Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = 1;
        this.color = "black";
    }

    public Cat(int weight, int age)
    {
        this.age = age;
        this.weight = weight;
        this.color = "black";
    }

    public Cat(int weight, String color, String address)
    {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 1;
    }

    public Cat(int weight, String color)
    {
        this.weight = weight;
        this.color = color;
        this.age = 1;
    }

//    У класса должен быть конструктор, принимающий в качестве
//    параметров вес, цвет и инициализирующий все переменные класса,
//    кроме имени и адреса.

    public static void main(String[] args) {

    }
}
