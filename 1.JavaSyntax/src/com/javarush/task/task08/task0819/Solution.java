package com.javarush.task.task08.task0819;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
/* 
Set из котов
*/

public class Solution {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Cat test = new Cat("aa", 10);
        Iterator<Cat> it = cats.iterator();
        int i = 0;
        while(it.hasNext())
        {
            System.out.println(it.next());
            if (i == 0)
            {
                it.remove();
                i = 1;
            }
        }
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<Cat>();
        cats.add(new Cat("aa", 10));
        cats.add(new Cat("aaa", 100));
        cats.add(new Cat("aaaa", 1000));
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for(Cat pr:cats){
            System.out.println(pr);
        }
    }

    public static class Cat {
        public String name;
        public int age;

        public Cat (){
            this.name = "name";
            this.age = 1;
        }
        public Cat (String name, int age){
            this.name = name;
            this.age = age;
        }
    }
}
