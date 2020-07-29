package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine()), b = Integer.parseInt(reader.readLine());
        if (a > b)
            System.out.print(b);
        else
            System.out.print(a);
    }
}