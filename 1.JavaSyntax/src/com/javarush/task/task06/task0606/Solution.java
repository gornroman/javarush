package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int len = str.length();
        while (len > 0)
        {
            int x = str.charAt(len - 1) - '0';
//            System.out.println("len: " + len + ", x: " + x);
            if (x % 2 == 0)
                even++;
            else
                odd++;
            len--;
        }
        System.out.print("Even: " + even + " Odd: " + odd);
    }
}
