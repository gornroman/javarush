package com.javarush.task.task07.task0710;

/* 
В начало списка
*/

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < 10; i++)
        {
            list.add(0, reader.readLine());
        }
        for(int i = 0; i < 10; i++)
        {
            System.out.println(list.get(i));
        }
    }
}
