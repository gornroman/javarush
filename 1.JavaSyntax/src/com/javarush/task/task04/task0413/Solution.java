package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (num > 7 || num < 1)
            System.out.print("такого дня недели не существует");
        if (num == 1)
            System.out.print("понедельник");
        else if (num == 2)
            System.out.print("вторник");
        else if (num == 3)
            System.out.print("среда");
        else if (num == 4)
            System.out.print("четверг");
        else if (num == 5)
            System.out.print("пятница");
        else if (num == 6)
            System.out.print("суббота");
        else if (num == 7)
            System.out.print("воскресенье");
    }
}