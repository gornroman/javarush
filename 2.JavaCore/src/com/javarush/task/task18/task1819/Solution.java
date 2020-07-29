package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File f1 = new File(reader.readLine());
        File f2 = new File(reader.readLine());
        reader.close();
        FileOutputStream fileOutput1 = new FileOutputStream(f1);
        FileInputStream fileInput1 = new FileInputStream(f1);
        FileInputStream fileInput2 = new FileInputStream(f2);
        byte[] buffer1 = new byte[fileInput1.available()];
        while(fileInput1.available() > 0)
        {
            int data = fileInput1.read(buffer1);
        }
        fileInput1.close();
        byte[] buffer2 = new byte[fileInput2.available()];
        while(fileInput2.available() > 0)
        {
            int data = fileInput2.read(buffer2);
        }
        fileInput2.close();
        fileOutput1.write(buffer2);
        fileOutput1.write(buffer1);
        fileOutput1.close();
    }
}
