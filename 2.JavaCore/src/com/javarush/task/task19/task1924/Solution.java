package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(bufferedReader.readLine()));
        bufferedReader.close();
        String data = file.readLine();
        List<String> strings = new ArrayList<>();
        while (data != null)
        {
            String[] words = data.split(" ");
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < words.length; i++)
            {
                int flag = 0;
                for (Map.Entry <Integer, String> entry : map.entrySet())
                {
                    if (words[i].equals(entry.getKey().toString()))
                    {
                        stringBuilder.append(entry.getValue()).append(" ");
                        flag = 1;
                    }
                }
                if (flag == 0)
                    stringBuilder.append(words[i]).append(" ");
            }
            strings.add(stringBuilder.toString().trim());
            data = file.readLine();
        }
        for (int i = 0; i < strings.size(); i++)
        {
            System.out.println(strings.get(i));
        }
        file.close();
    }
}
