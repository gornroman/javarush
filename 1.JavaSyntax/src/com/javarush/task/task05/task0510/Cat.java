package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    public String name = null;
    public int weight;
    public int age;
    public String address = null;
    public String color;
    public static void main(String[] args) {

    }
    public void initialize(String name)
    {
        this.name = name;

        this.weight = 1;
        this.age = 1;
        this.color = "black";
    }
    public void initialize(String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;

        this.color = "black";
    }
    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;

        this.color = "black";
        this.weight = 1;
    }
    public void initialize(int weight, String color)
    {
        this.weight = weight;
        this.color = color;

        this.age = 1;
    }
    public void initialize(int weight, String color, String address)
    {
        this.weight = weight;
        this.color = color;
        this.address = address;

        this.age = 1;
    }
}
