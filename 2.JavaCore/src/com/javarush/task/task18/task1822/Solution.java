package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(name.readLine()));
        name.close();
        String line = file.readLine();
//        System.out.println(line.substring(0, args[0].length()));
        while (line != null)
        {
//            String tmp = line.substring(0, args[0].length());
            if (line.startsWith(args[0] + " "))
                System.out.println(line);
            line = file.readLine();
        }
        file.close();
    }
}
