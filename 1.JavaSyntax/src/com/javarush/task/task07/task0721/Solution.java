package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] str = new int[20];
        int maximum;
        int minimum;
        for (int i = 0; i < 20; i++)
            str[i] = Integer.parseInt(reader.readLine());
        maximum = str[0];
        minimum = str[0];
        for (int i = 0; i < 20; i++)
        {
            if (str[i] > maximum)
                maximum = str[i];
            if (str[i] < minimum)
                minimum = str[i];
        }
        System.out.print(maximum + " " + minimum);
    }
}
