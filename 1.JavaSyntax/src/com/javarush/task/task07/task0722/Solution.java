package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> str = new ArrayList<String>();
        String end = "end";
        while (true)
        {
            String tmp = reader.readLine();
            if (tmp.equals(end))
                break;
            str.add(tmp);
        }
        int len = str.size();
        for (int i = 0; i < len; i++)
            System.out.println(str.get(i));
    }
}