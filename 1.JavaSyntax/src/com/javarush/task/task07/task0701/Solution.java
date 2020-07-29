package com.javarush.task.task07.task0701;

import java.io.IOException;

/* 
Массивный максимум
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int arr []  = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++)
        {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        return arr;
    }

    public static int max(int[] array) {
        int m = -2147483648;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > m)
                m = array[i];
        }
        return m;
    }
}
