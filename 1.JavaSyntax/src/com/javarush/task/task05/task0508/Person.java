package com.javarush.task.task05.task0508;

/* 
Геттеры и сеттеры для класса Person
*/

public class Person {
    //напишите тут ваш код
    public String name;
    public int age;
    public char sex;
    public static void main(String[] args) {

    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return this.age;
    }
    public void setSex(char a)
    {
        this.sex = a;
    }
    public char getSex()
    {
        return this.sex;
    }
}
