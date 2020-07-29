package com.javarush.task.task07.task0708;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxlen = 0;
        for(int i = 0; i < 5; i++)
        {
            strings.add(reader.readLine());
            if (strings.get(i).length() > maxlen)
            {
                maxlen = strings.get(i).length();
            }
        }
        for(int i = 0; i < 5; i++)
        {
            if (strings.get(i).length() == maxlen)
                System.out.println(strings.get(i));
        }
    }
}
