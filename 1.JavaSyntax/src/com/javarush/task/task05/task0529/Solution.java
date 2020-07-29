package com.javarush.task.task05.task0529;

/* 
Консоль-копилка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        String sum = "сумма";
        while (true)
        {
            String str = reader.readLine();
            if (str.equals(sum))
                break;
            int x = Integer.parseInt(str);
            a += x;
        }
        System.out.print(a);
    }
}
