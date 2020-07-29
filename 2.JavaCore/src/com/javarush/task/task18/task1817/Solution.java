package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int space = 0;
        int letters = 0;
        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            if (data == ' ')
                space++;
            letters++;
        }
        float ans = (float)space/(float)letters * 100;
        System.out.printf("%.2f", ans);
        fileInputStream.close();
    }
}
