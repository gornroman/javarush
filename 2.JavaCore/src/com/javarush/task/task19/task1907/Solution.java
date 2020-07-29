package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        String str = fileReader.readLine();
        int count = 0;
        while (str != null)
        {
            String[] words = str.split("\\W");
            for (int i = 0; i < words.length; i++)
            {
                if (words[i].equals("world"))
                    count++;
            }
            str = fileReader.readLine();
        }
        fileReader.close();
        System.out.println(count);
    }
}
