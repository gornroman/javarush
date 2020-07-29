package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> dogs = new HashSet<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> res = new HashSet<>();
        res.addAll(cats);
        res.addAll(dogs);
        return res;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        Iterator<Object> it_pets = pets.iterator();
        while (it_pets.hasNext())
        {
            Object o = it_pets.next();
            Iterator<Cat> it_cats = cats.iterator();
            while (it_cats.hasNext())
            {
                Object c = it_cats.next();
                if (o == c)
                    it_pets.remove();
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        Iterator<Object> it = pets.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public static class Cat{

    }

    public static class Dog{

    }
}
