package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine()), n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < m; i++)
        {
            for (int y = 0; y < n; y++)
            {
                System.out.print("8");
            }
            System.out.println("");
        }
    }
}