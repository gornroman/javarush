package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лира");
        strings.add("лоза");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size();)
        {
//            System.out.println("i: " + i + ", size: " + strings.size() + ", str: " + strings.get(i));
            int r = 0;
            int l = 0;
            for (int j = 0; j < strings.get(i).length(); j++)
            {
                if (strings.get(i).charAt(j) == 'р')
                    r++;
                if (strings.get(i).charAt(j) == 'л')
                    l++;
            }
            if (r > 0 && l > 0)
            {
//                System.out.println("SKIPPED: " + strings.get(i));
                r = 0;
                l = 0;
            }

            if (r > 0)
            {
//                System.out.println("REMOVED: " + strings.get(i));
                strings.remove(i);
            }
            else if (l > 0)
            {
//                System.out.println("ADDED: " + strings.get(i));
                strings.add(i, strings.get(i));
                i++;
                i++;
            }
            else
                i++;
        }
        return strings;
    }
}