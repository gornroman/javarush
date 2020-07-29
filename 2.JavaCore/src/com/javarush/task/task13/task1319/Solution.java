package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        ArrayList<String> array = new ArrayList<String>();
        BufferedWriter writer = new BufferedWriter(new FileWriter(name));
//        OutputStream out = new FileOutputStream(name);

        while (true)
        {
            String str = reader.readLine();
            array.add(str);
            if (str.equals("exit"))
                break ;
        }
        for (int i = 0; i < array.size(); i++)
        {
            writer.write(array.get(i) + "\n");
        }

        reader.close();
        writer.close();
    }
}
