package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = -2147483648;
        int i = Integer.parseInt(reader.readLine());
        if (i > 0)
        {
            while (i > 0)
            {
                int x = Integer.parseInt(reader.readLine());
                if (maximum < x)
                    maximum = x;
                i--;
            }
            System.out.println(maximum);
        }
    }
}
