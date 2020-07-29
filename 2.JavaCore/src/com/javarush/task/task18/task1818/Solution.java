package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File f1 = new File(reader.readLine());
        File f2 = new File(reader.readLine());
        File f3 = new File(reader.readLine());
        FileOutputStream file1 = new FileOutputStream(f1);
        FileInputStream file2 = new FileInputStream(f2);
        FileInputStream file3 = new FileInputStream(f3);
        while(file2.available() > 0)
        {
            int data = file2.read();
            file1.write(data);
        }
        while(file3.available() > 0)
        {
            int data = file3.read();
            file1.write(data);
        }
        reader.close();
        file1.close();
        file2.close();
        file3.close();
    }
}
