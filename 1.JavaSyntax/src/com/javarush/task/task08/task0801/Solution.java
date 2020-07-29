package com.javarush.task.task08.task0801;

import java.util.HashSet;
import java.util.Set;

/* 
Set из растений
*/

public class Solution {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add("арбуз");
        s.add("банан");
        s.add("вишня");
        s.add("груша");
        s.add("дыня");
        s.add("ежевика");
        s.add("женьшень");
        s.add("земляника");
        s.add("ирис");
        s.add("картофель");

        for (String str : s)
        {
            System.out.println(str);
        }
    }
}
