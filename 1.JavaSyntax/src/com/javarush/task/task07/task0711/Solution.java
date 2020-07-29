package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
*/

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());
        }
        for(int i = 0; i < 13; i++)
        {
            String temp = list.get(4);
            list.remove(4);
            list.add(0, temp);
        }
        for(int i = 0; i < 5; i++)
        {
            System.out.println(list.get(i));
        }
    }
}
