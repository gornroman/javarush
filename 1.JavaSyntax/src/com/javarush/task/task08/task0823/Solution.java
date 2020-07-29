package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        StringBuilder result = new StringBuilder(string);
        result.setCharAt(0, Character.toUpperCase(string.charAt(0)));
        for (int i = 1; i < string.length(); i++)
        {
            result.setCharAt(i, string.charAt(i));
            Character cur = string.charAt(i);
            Character prev = string.charAt(i - 1);
            if (cur >= 'a' && cur <= 'z' || cur >= 'а' && cur <= 'я')
            {
                if (prev == ' ')
                    result.setCharAt(i, Character.toUpperCase(string.charAt(i)));
                else
                    result.setCharAt(i, string.charAt(i));
            }
        }
        System.out.println(result);
    }
}
