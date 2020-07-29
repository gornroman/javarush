package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
//        String test = "Lion.avi.part1234";
//        String t1 = test.substring(0, test.lastIndexOf("."));
//        System.out.println(t1);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, String> map = new HashMap<Integer, String>();
        int count = 0;
        String name = null;
        while (true)
        {
            String filename = reader.readLine();
            if (filename.equals("end"))
                break;
            name = filename.substring(0, filename.lastIndexOf("."));
            count++;
            BufferedReader filereader = new BufferedReader(new FileReader(filename));
            String numOfFile = filename.substring(filename.lastIndexOf("t") + 1);
            map.put(Integer.parseInt(numOfFile), filereader.readLine());
            filereader.close();
        }
        reader.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter(name, true));
        for (int i = 1; i <= count; i++)
        {
            writer.write(map.get(i));
        }
        writer.close();
    }
}
