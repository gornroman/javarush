package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine()), b = Integer.parseInt(reader.readLine()), c = Integer.parseInt(reader.readLine());
        if (a >= b && a >= c)
        {
            if (b >= c)
                System.out.print(a + " " + b + " " + c);
            else
                System.out.print(a + " " + c + " " + b);
        }
        else if (b >= a && b >= c)
        {
            if (a >= c)
                System.out.print(b + " " + a + " " + c);
            else
                System.out.print(b + " " + c + " " + a);
        }
        else if (c >= a && c >= b)
        {
            if (a >= b)
                System.out.print(c + " " + a + " " + b);
            else
                System.out.print(c + " " + b + " " + a);
        }
    }
}
