package com.javarush.task.task08.task0818;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Ivanov", 200);
        map.put("Ivanov2", 200);
        map.put("Ivanov3", 300);
        map.put("Ivanov4", 400);
        map.put("Ivanov5", 500);
        map.put("Ivanov6", 600);
        map.put("Ivanov7", 700);
        map.put("Ivanov8", 800);
        map.put("Ivanov9", 900);
        map.put("Ivanov10", 1000);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<String, Integer>(map);
        Iterator<Map.Entry<String, Integer>> it = copy.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry<String, Integer> pair = it.next();
            if (pair.getValue() < 500)
            {
                removeItemFromMapByValue(map, pair.getKey());
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, Integer> map, String value) {
//        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getKey().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }
    public static void main(String[] args) {

    }
}