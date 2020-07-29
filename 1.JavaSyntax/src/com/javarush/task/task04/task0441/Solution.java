package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine()), b = Integer.parseInt(reader.readLine()), c = Integer.parseInt(reader.readLine());
        int max =0, min=0;
        if (a == b && b == c)
            System.out.print(a);
        else if (a == b || a == c)
            System.out.print(a);
        else if (b == a || b == c)
            System.out.print(b);
        else if (c == a || b == c)
            System.out.print(c);
        else
        {
            if (a > b && a > c)
                max = a;
            if (a < b && a < c)
                min = a;
            if (b > a && b > c)
                max = b;
            if (b < a && b < c)
                min = b;
            if (c > a && c > b)
                max = c;
            if (c < a && c < b)
                min = c;
            if (a > min && a < max)
                System.out.print(a);
            else if (b > min && b < max)
                System.out.print(b);
            else if (c > min && c < max)
                System.out.print(c);
        }
    }
}
