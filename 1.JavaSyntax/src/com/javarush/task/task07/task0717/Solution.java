package com.javarush.task.task07.task0717;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Считать строки с консоли и объявить ArrayList list тут
        for (int i = 0; i < 10; i++)
        {
            list.add(reader.readLine());
        }
        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for (String s : result)   //быстрый for по всем элементам, только для коллекций
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++)
        {
            list.add(i, list.get(i));
            i++;
        }
        return list;
    }
}
