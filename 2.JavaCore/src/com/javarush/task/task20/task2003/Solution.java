package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();
//    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    File myFile = new File(reader.readLine());
//    OutputStream outputStream = new FileOutputStream(myFile);
//    InputStream inputStream = new FileInputStream(myFile);

    public Solution() throws IOException {
    }

    public static void save(OutputStream outputStream) throws Exception {
        if (runtimeStorage.size() > 0)
        {
            Properties prop = new Properties();
            prop.putAll(runtimeStorage);
            prop.store(outputStream, "");
        }
    }

    public static void load(InputStream inputStream) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        Properties prop = new Properties();
        prop.load(inputStream);
        prop.forEach((k, v) -> runtimeStorage.put((String)k, (String)v));
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
