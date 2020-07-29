package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String,String>();
        map.put("Ivanov", "Ivan");
        map.put("Ivano", "Ivsan");
        map.put("Ivanv", "Ivasn");
        map.put("Ivaov", "Ivans");
        map.put("Ivnov", "Ivanf");
        map.put("Ianov", "gIvan");
        map.put("vanov", "Igvan");
        map.put("Ivan", "Ivan");
        map.put("Ivov", "Ivan");
        map.put("anov", "Ivan");
        return map;
    }

//    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
//        Map<String, String> copy = new HashMap<>(map);
//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//        int i = 0;
//        while (iterator.hasNext())
//        {
//            i++;
//            Map.Entry<String, String> x = iterator.next();
//            String val = x.getValue();
//            String key = x.getKey();
////            System.out.println("i: " + i + ", key: " + key + ", val: " + val );
//            Map<String, String> map2 = new HashMap<>(map);
//            Iterator<Map.Entry<String, String>> iterator2 = map2.entrySet().iterator();
//            int y = 0;
//            while (iterator2.hasNext())
//            {
//                Iterator<Map.Entry<String, String>> iterator3 = copy.entrySet().iterator();
//                y++;
////                System.out.println("i: " + i + ", y: " + y);
//                Map.Entry<String, String> x2 = iterator2.next();
//                if (x2.getValue().equals(val) && !x2.getKey().equals(key))
//                {
////                    System.out.println("This name will be deleted soon: " + "key " + x2.getKey() + ", value: " + x2.getValue());
//                    removeItemFromMapByValue(copy, x2.getValue());
//                }
//            }
//        }
//    }
//    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
//        Map<String, String> copy = new HashMap<>(map);
//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext())
//        {
//            Map.Entry<String, String> x = iterator.next();
//            String val = x.getValue();
//            String key = x.getKey();
////            Iterator<Map.Entry<String, String>> iterator2 = copy.entrySet().iterator();
//            while (iterator.hasNext())
//            {
//                Map.Entry<String, String> x2 = iterator.next();
//                if (x2.getValue().equals(val) && !x2.getKey().equals(key))
//                {
//                    removeItemFromMapByValue(map, x2.getValue());
//                }
//            }
//        }
//    }

//    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
//        Map<String, String> copy = new HashMap<>(map);
//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext())
//        {
//            Map.Entry<String, String> x = iterator.next();
//            String val = x.getValue();
//            String key = x.getKey();
//            Iterator<Map.Entry<String, String>> iterator2 = copy.entrySet().iterator();
//            while (iterator2.hasNext())
//            {
//                Map.Entry<String, String> x2 = iterator2.next();
//                if (x2.getValue().equals(val) && !x2.getKey().equals(key))
//                {
//                    removeItemFromMapByValue(copy, x2.getValue());
//                }
//            }
//        }
//    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> list = new ArrayList<String>();
        Map<String, String> copy = new HashMap<>(map);
        Iterator<Map.Entry<String, String>> iterator = copy.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> x = iterator.next();
            String val = x.getValue();
            String key = x.getKey();
            Iterator<Map.Entry<String, String>> iterator2 = copy.entrySet().iterator();
            while (iterator2.hasNext())
            {
                Map.Entry<String, String> x2 = iterator2.next();
                if (x2.getValue().equals(val) && !x2.getKey().equals(key))
                {
                    removeItemFromMapByValue(map, x2.getValue());
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
