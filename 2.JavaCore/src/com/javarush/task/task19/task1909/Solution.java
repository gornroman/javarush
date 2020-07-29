package com.javarush.task.task19.task1909;

/* 
Замена знаков
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
            String tmp = str.replace(".", "!");
            file2.write(tmp);
            str = file1.readLine();
        }
        file1.close();
        file2.close();
    }
}
