package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        reader.close();
        System.setOut(printStream);
        testString.printSomething();
        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.close();
        System.setOut(out);
        System.out.println(byteArrayOutputStream.toString());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

