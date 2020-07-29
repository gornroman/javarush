package com.javarush.task.task08.task0821;

import java.util.Map;
import java.util.HashMap;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> ppl = new HashMap<String, String>();
        ppl.put("Ivano", "123");
        ppl.put("Ivano", "123");
        ppl.put("Ivano2", "123");
        ppl.put("Ivano3", "123");
        ppl.put("Ivano4", "1234");
        ppl.put("Ivano5", "1235");
        ppl.put("Ivano6", "1236");
        ppl.put("Ivano7", "123");
        ppl.put("Ivano8", "123");
        ppl.put("Ivano9", "123");
        return ppl;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
