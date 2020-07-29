package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine()), b = Integer.parseInt(reader.readLine()), c = Integer.parseInt(reader.readLine());
        if (a == b && b == c)
            System.out.print(a + " " + b + " " + c);
        else
        {
            if (a == b)
                System.out.print(a + " " + b);
            if (b == c)
                System.out.print(b + " " + c);
            if (a == c)
                System.out.print(a + " " + c);
        }
    }
}