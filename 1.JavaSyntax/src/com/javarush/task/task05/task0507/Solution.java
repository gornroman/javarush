package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double i = 0, count = 0;
        while (true)
        {
            double num = Integer.parseInt(reader.readLine());
            if (num == -1)
                break;
            i += num;
            count++;
        }
        System.out.print(i/count);
    }
}

