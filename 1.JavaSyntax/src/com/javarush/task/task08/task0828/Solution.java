package com.javarush.task.task08.task0828;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        HashMap<Integer, String> arr = new HashMap<Integer, String>(12);
        arr.put(1, "January");
        arr.put(2, "February");
        arr.put(3, "March");
        arr.put(4, "April");
        arr.put(5, "May");
        arr.put(6, "June");
        arr.put(7, "July");
        arr.put(8, "August");
        arr.put(9, "September");
        arr.put(10, "October");
        arr.put(11, "November");
        arr.put(12, "December");
        Iterator it = arr.entrySet().iterator();
        int nbr = 0;
        while (it.hasNext())
        {
            Map.Entry pair = (Map.Entry)it.next();
            if (pair.getValue().equals(str))
                nbr = Integer.parseInt(pair.getKey().toString());
        }
        System.out.println(str + " is the " + nbr + " month");
    }
}
