package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (num > 0)
            num *= 2;
        else if (num < 0)
            num += 1;
        System.out.print(num);
    }

}