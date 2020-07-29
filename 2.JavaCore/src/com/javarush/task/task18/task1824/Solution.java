package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String name = null;
            try {
                FileInputStream file = new FileInputStream(name = reader.readLine());
                file.close();
            }
            catch(FileNotFoundException e)
            {
                System.out.println(name);
                reader.close();
                break;
            }
        }
    }
}
