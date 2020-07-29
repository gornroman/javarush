package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[20];
        for(int i = 0; i < 20; i++)
        {
            num[i] = Integer.parseInt(reader.readLine());
        }
        int[] num2 = new int[10];
        int[] num3 = new int[10];
        for (int i = 0; i < num2.length; i++)
        {
            num2[i] = num[i];
        }
        for (int i = 0; i < num3.length; i++)
        {
            num3[i] = num[i + 10];
        }
        for (int i = 0; i < num3.length; i++)
        {
            System.out.println(num3[i]);
        }
    }
}
