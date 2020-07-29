package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("0", new Cat("Name1"));
        map.put("1", new Cat("Name2"));
        map.put("2", new Cat("Name3"));
        map.put("3", new Cat("Name4"));
        map.put("4", new Cat("Name5"));
        map.put("5", new Cat("Name6"));
        map.put("6", new Cat("Name7"));
        map.put("7", new Cat("Name8"));
        map.put("8", new Cat("Name9"));
        map.put("9", new Cat("Name10"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<Cat>();
        for (int i = 0; i < map.size(); i++)
        {
            set.add(map.get(Integer.toString(i)));
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
