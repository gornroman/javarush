package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int min = 2147483647;
        while(inputStream.available() > 0)
        {
            int data = inputStream.read();
            if (data < min)
                min = data;
        }
        System.out.println(min);
        inputStream.close();
        reader.close();
    }
}
