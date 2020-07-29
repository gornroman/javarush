package com.javarush.task.task18.task1803;

/* 
Самые частые байты
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
        Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
        while(inputStream.available() > 0)
        {
            int data = inputStream.read();
            if (maps.containsKey(data)) {
                int tmp = maps.get(data);
                maps.put(data, tmp+1);
            }
            else
                maps.put(data, 1);
        }
        int maxvalue = 0;
        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            if(entry.getValue() > maxvalue)
                maxvalue = entry.getValue();
        }

        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            if(entry.getValue() == maxvalue)
                System.out.print(entry.getKey() + " ");
        }
        reader.close();
        inputStream.close();
    }
}
