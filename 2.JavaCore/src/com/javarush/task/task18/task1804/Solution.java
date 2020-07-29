package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int min = 2147483647;
        while(inputStream.available() > 0)
        {
            int data = inputStream.read();
            if (map.containsKey(data))
            {
                int tmp = map.get(data);
                map.put(data, tmp + 1);
            }
            else
            {
                map.put(data, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() < min)
                min = entry.getValue();
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == min)
                System.out.print(entry.getKey() + " ");
        }
        reader.close();
        inputStream.close();
    }
}
