package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        FileInputStream inStream = new FileInputStream(name);
//        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        while (inStream.available() > 0)
        {
//            writer.write(inStream.read());
            System.out.write(inStream.read());
        }
//        System.out.println();
        inStream.close();
        reader.close();
    }
}