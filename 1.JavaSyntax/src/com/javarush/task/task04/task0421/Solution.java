package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine(), name2 = reader.readLine();
        if (name1.equals(name2))
            System.out.print("Имена идентичны");
        else
        {
            if (name1.length() == name2.length())
                System.out.print("Длины имен равны");
        }
    }
}