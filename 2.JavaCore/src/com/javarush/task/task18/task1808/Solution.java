package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        FileOutputStream file3 = new FileOutputStream(reader.readLine());
        int flag = 0;
        byte[] buffer = null;
        while (file1.available() > 0)
        {
            if (flag == 0)
            {
                if (file1.available() % 2 != 0)
                {
                    buffer = new byte[file1.available()/2+1];
                }
                else
                {
                    buffer = new byte[file1.available()/2];
                }
                int count = file1.read(buffer);
                file2.write(buffer, 0, count);
                flag = 1;
            }
            else
            {
                buffer = new byte[file1.available()];
                int count = file1.read(buffer);
                file3.write(buffer, 0, count);
            }

        }
        reader.close();
        file1.close();
        file2.close();
        file3.close();
    }
}
