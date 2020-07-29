package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream file1 = new FileInputStream(args[1]);
        FileOutputStream file2 = new FileOutputStream(args[2]);
        if (args[0].equals("-e"))
        {
            while (file1.available() > 0)
            {
                int data = file1.read();
                file2.write(data+1);
            }
        }
        else
        {
            while (file1.available() > 0)
            {
                int data = file1.read();
                file2.write(data-1);
            }
        }
        file1.close();
        file2.close();
    }

}
