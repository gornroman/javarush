package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(bufferedReader.readLine()));
        bufferedReader.close();
        String data = file.readLine();
        while (data != null)
        {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = data.length(); i > 0; i--)
                stringBuilder.append(data.charAt(i - 1));
            System.out.println(stringBuilder);
            data = file.readLine();
        }
        file.close();
    }
}
