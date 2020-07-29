package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float a = Float.parseFloat(reader.readLine());
        int b = (int)a/10;
        a = a - 10 * b;
        if (a > 5)
            a -= 5;
        if (a < 3)
            System.out.println("зеленый");
        else if (a < 4)
            System.out.println("жёлтый");
        else if (a < 5)
            System.out.println("красный");
        else
            System.out.println("зеленый");
    }
}