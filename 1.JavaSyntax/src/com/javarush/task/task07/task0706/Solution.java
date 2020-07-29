package com.javarush.task.task07.task0706;

import java.io.IOException;

/* 
Улицы и дома
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[15];
        for(int i = 0; i < num.length; i++)
        {
            num[i] = Integer.parseInt(reader.readLine());
        }
        int chet = 0, nechet = 0;
        for(int i = 0; i < num.length; i++)
        {
            if (i%2 == 0)
                chet += num[i];
            else
                nechet += num[i];
        }
        if (nechet > chet)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else
            System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}
