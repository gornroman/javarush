package com.javarush.task.task08.task0815;

import java.util.Map;
import java.util.HashMap;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Петров", "Иван");
        map.put("Иваноа", "Петр");
        map.put("Смирновв", "Кирилл");
        map.put("Залуповф", "Семен");
        map.put("Чебуров", "Роман");
        map.put("Смирноцв", "cba");
        map.put("Залупов", "Петр");
        map.put("abcц", "Илья");
        map.put("Ивано", "cba");
        map.put("abc", "cbСеменa");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> s : map.entrySet())
        {
            String str = s.getValue();
            if (name.equals(str))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> s : map.entrySet())
        {
            String str = s.getKey();
            if (lastName.equals(str))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
