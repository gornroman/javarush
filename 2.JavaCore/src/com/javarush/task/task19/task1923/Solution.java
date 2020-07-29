package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file1 = new BufferedReader(new FileReader(args[0]));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(args[1]));
        String data = file1.readLine();
        while (data != null)
        {
            String[] words = data.split(" ");
            for (int i = 0; i < words.length; i++)
            {
                if (words[i].matches(".*[\\d].*"))
                    file2.write(words[i] + " ");
            }
            data = file1.readLine();
        }
        file1.close();
        file2.close();
    }
}
