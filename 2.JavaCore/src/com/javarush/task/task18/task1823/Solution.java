package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String data = buffer.readLine();
            if (data.equals("exit"))
                break ;
            new ReadThread(data);
        }
        buffer.close();
    }

    public static class ReadThread extends Thread {
        public ReadThread(String fileName) throws IOException {
            FileInputStream file = new FileInputStream(fileName);
            int[] chars = new int[128];
            for (int i = 0; i < chars.length; i++)
                chars[i] = 0;
            while (file.available() > 0)
            {
                int data = file.read();
                chars[data] += 1;
            }
            int counter = -1;
            int chr = -1;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] > counter)
                {
                    counter = chars[i];
                    chr = i;
                }
            }
            file.close();
            resultMap.put(fileName, chr);
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
