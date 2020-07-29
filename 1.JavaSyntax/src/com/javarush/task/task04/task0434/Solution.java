package com.javarush.task.task04.task0434;

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        while (i < 11)
        {
            int j = 0;
            int x = i;
            while (j < 10)
            {
                System.out.print(x + " ");
                x = x + i;
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
