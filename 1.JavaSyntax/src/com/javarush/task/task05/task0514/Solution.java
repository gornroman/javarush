package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("name", 123);
    }

    static class Person {
        public String name;
        public int age;

        public void initialize(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
    }
}
