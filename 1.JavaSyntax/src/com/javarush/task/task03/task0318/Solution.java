package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
        String name = bufferedReader.readLine(); //читаем строку с клавиатуры
//        int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.
        System.out.print(name + " захватит мир через  " + sAge + "  лет. Му-ха-ха!");

    }
}
