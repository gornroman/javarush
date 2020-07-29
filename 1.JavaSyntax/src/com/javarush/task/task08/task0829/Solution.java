package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, String> list = new HashMap<Integer, String>();
        HashMap<Integer, String>  list2 = new HashMap<Integer, String>();
        int flag = 1;
        int i = 0;
        int j = 0;
        while (true) {
            String tmp = reader.readLine();
            if (tmp.isEmpty()) {
                break;
            }
            if (flag % 2 == 0)
            {
                list.put(i, tmp);
                i++;
            }
            else
            {
                list2.put(j, tmp);
                j++;
            }
            flag++;
        }

        // Read the house number
        String city = reader.readLine();

        Iterator it = list2.entrySet().iterator();
        int nbr = 0;
        while (it.hasNext())
        {
            Map.Entry pair = (Map.Entry)it.next();
            if (pair.getValue().equals(city))
                nbr = Integer.parseInt(pair.getKey().toString());
        }
        Iterator it2 = list.entrySet().iterator();
        while (it2.hasNext())
        {
            Map.Entry pair2 = (Map.Entry)it2.next();
            if (pair2.getKey().equals(nbr))
                System.out.println(pair2.getValue());
        }
//        if (0 <= houseNumber && houseNumber < list.size()) {
//            String familyName = list.get(houseNumber);
//            System.out.println(familyName);
//        }
    }
}
