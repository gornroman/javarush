package com.javarush.task.task08.task0814;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> ints = new HashSet<Integer>();
        for (int i = 0; i < 20; i++)
            ints.add(i);
        return ints;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            Integer setElement = iterator.next();
            if(setElement > 10) {
                iterator.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
