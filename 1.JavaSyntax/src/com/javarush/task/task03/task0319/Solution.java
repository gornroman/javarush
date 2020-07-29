package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String int1 = bufferedReader.readLine();
        String int2 = bufferedReader.readLine();
        System.out.print(name + " получает " + int1 + " через " + int2 + " лет.");

    }
}
