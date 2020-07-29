package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
//        bufferedReader.close();
        Map<String, Double> map = new TreeMap<String, Double>();
        String str = file.readLine();
        while (str != null)
        {
            String[] lines = str.split(" ");
            if (!map.containsKey(lines[0]))
                map.put(lines[0], Double.parseDouble(lines[1]));
            else
                map.replace(lines[0], Double.parseDouble(lines[1]) + map.get(lines[0]));
            str = file.readLine();
        }
        file.close();
        double max = -1;
        for (Map.Entry<String, Double> entry : map.entrySet())
        {
            if (max < entry.getValue())
                max = entry.getValue();
        }
        for (Map.Entry<String, Double> entry : map.entrySet())
        {
            if (max == entry.getValue())
                System.out.println(entry.getKey());
        }
    }
}
