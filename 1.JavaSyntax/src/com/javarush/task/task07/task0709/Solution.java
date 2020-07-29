package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        int minlen = 2147483647;
        for (int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());
            if (list.get(i).length() < minlen)
                minlen = list.get(i).length();
        }
        for (int i = 0; i < 5; i++)
        {
            if (list.get(i).length() == minlen)
                System.out.println(list.get(i));
        }
    }
}
