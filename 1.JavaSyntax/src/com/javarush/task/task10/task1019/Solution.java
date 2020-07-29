package com.javarush.task.task10.task1019;

/* 
Функциональности маловато!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while (true)
        {
            String tmp = reader.readLine();
            if (tmp.length() == 0)
                break;
            int id = Integer.parseInt(tmp);
            String name = reader.readLine();
            map.put(name, id);
        }
        map.forEach((k, v) -> System.out.println(v+ " " + k));

//        map.forEach();
//        System.out.println("Id=" + id + " Name=" + name);
    }
}
