package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        while (inputStream.available() > 0)
        {
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            for(int i = 0; i < buffer.length / 2; i++)
            {
                byte temp = buffer[i];
                buffer[i] = buffer[buffer.length - i - 1];
                buffer[buffer.length - i - 1] = temp;
            }
            outputStream.write(buffer, 0, count);
        }
        reader.close();
        inputStream.close();
        outputStream.close();
    }
}
