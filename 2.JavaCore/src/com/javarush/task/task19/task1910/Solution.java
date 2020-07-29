package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        String str = file1.readLine();
        while (str != null)
        {
            String tmp = str.replaceAll("\\p{Punct}", "");
            file2.write(tmp);
            str = file1.readLine();
        }
        file1.close();
        file2.close();
    }
}
