package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine()), b = Integer.parseInt(reader.readLine()), c = Integer.parseInt(reader.readLine()), pos = 0, neg = 0;
            if (a > 0)
                pos++;
            else if (a < 0)
                neg++;
            if (b > 0)
                pos++;
            else if (b < 0)
                neg++;
            if (c > 0)
                pos++;
            else if (c < 0)
                neg++;
            System.out.println("количество отрицательных чисел: " + neg);
            System.out.print("количество положительных чисел: " + pos);
    }
}
