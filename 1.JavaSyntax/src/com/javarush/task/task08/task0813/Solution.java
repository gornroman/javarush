package com.javarush.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;
/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        Set<String> str = new HashSet<String>();
        for (int i = 0; i < 20; i++)
            str.add("Л" + i);
        return str;
    }

    public static void main(String[] args) {

    }
}
