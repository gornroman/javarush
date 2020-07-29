package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        int a = 366;
        int b = 365;
        if (year % 400 == 0)
            System.out.print("количество дней в году: " + a);
        else if (year % 100 == 0)
            System.out.print("количество дней в году: " + b);
        else if (year % 4 == 0)
            System.out.print("количество дней в году: " + a);
        else
            System.out.print("количество дней в году: " + b);
    }
}