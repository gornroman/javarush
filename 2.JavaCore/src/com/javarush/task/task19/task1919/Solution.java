package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> map = new TreeMap<String, Double>();
        String tmp = file.readLine();
        while (tmp != null)
        {
            String[] lines = tmp.split(" ");
            if (!map.containsKey(lines[0]))
                map.put(lines[0], Double.parseDouble(lines[1]));
            else
            {
                double tmpDbl = map.get(lines[0]);
                map.replace(lines[0], tmpDbl + Double.parseDouble(lines[1]));
            }
            tmp = file.readLine();
        }
        file.close();

        for (Map.Entry <String, Double> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
