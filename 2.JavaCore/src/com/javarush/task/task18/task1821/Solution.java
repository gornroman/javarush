package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream(args[0]);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < 128; i++)
            map.put(i, 0);
        while (file.available() > 0)
        {
            int data = file.read();
            map.put(data, map.get(data) + 1);
        }
        file.close();
        for (Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            if (entry.getValue() != 0)
            {
                int a = entry.getKey();
                char b = (char) a;
                System.out.println(b + " " + entry.getValue());
            }

        }
    }
}
