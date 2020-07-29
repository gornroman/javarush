package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Locale;
import java.util.Iterator;
/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Залупоне", dateFormat.parse("MAY 1 2012"));
        map.put("Стлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталне", dateFormat.parse("MAY 1 2012"));
        map.put("Стллоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сллоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлое", dateFormat.parse("MAY 1 2012"));
        map.put("Сталле", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлон", dateFormat.parse("MAY 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> x = iterator.next();
            Date d = x.getValue();
            if (d.getMonth() >= 5 && d.getMonth() < 8)
                iterator.remove();
        }
//        for (Map.Entry<String, Date> m : map.entrySet())
//        {
//            if (m.getValue().getMonth() >= 5 && m.getValue().getMonth() < 8)
//                map.remove(m.getKey(), m.getValue());
//        }
    }

    public static void main(String[] args) {

    }
    //            if (m.getValue().after(start) && m.getValue().before(finish))
//            {
//                map.remove(m.getKey());
//            }
//            if (m.getValue().getTime() >= start.getTime() && m.getValue().getTime() < finish.getTime())
//            {
//                map.remove(m.getKey());
//            }
}
