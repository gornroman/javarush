package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine()), b = Integer.parseInt(reader.readLine()), c = Integer.parseInt(reader.readLine()), d  = Integer.parseInt(reader.readLine());
        if (a >= b && a >= c && a >= d)
            System.out.print(a);
        else if (b >= a && b >= c && b >= d)
            System.out.print(b);
        else if (c > a && c > b && c > d)
            System.out.print(c);
        else if (d >= a && d >= b && d >= c )
            System.out.print(d);
        else
            System.out.print(a);
    }
}
