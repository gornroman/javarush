package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int i = Integer.parseInt(s);
        if (i >= 1 && i <= 999)
        {
            if (s.length() == 1 && i%2==0)
                System.out.print("четное однозначное число");
            else if (s.length() == 1 && i%2!=0)
                System.out.print("нечетное однозначное число");
            else if (s.length() == 2 && i%2!=0)
                System.out.print("нечетное двузначное число");
            else if (s.length() == 2 && i%2==0)
                System.out.print("четное двузначное число");
            else if (s.length() == 3 && i%2!=0)
                System.out.print("нечетное трехзначное число");
            else if (s.length() == 3 && i%2==0)
                System.out.print("четное трехзначное число");
        }
    }
}
