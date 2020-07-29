package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file1 = new BufferedReader(new FileReader(args[0]));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(args[1]));
        String data = file1.readLine();
        StringBuilder stringBuilder = new StringBuilder();
        while (data != null)
        {
            String[] lines = data.split(" ");
            for (int i = 0; i < lines.length; i++)
            {
                if (lines[i].length() > 6)
                    stringBuilder.append(lines[i]).append(",");
            }
            data = file1.readLine();
        }
        String answer = stringBuilder.toString().substring(0, stringBuilder.toString().length() - 1);
        file2.write(answer);
        file1.close();
        file2.close();
    }
}
