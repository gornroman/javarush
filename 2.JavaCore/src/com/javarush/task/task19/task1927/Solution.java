package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream out = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream newOut = new PrintStream(byteArrayOutputStream);
        System.setOut(newOut);
        testString.printSomething();
        String data = byteArrayOutputStream.toString();
        String[] lines = data.split("\n");
        System.setOut(out);
        int counter = 0;
        for (int i = 0; i < lines.length; i++)
        {
            if (counter == 2)
            {
                System.out.println("JavaRush - курсы Java онлайн");
                System.out.println(lines[i]);
                counter = 1;
            }
            else
            {
                System.out.println(lines[i]);
                counter++;
            }
//            if ((i + 1) % 3 == 0)
//            {
//                System.out.println("JavaRush - курсы Java онлайн");
//                System.out.println(lines[i]);
//            }
//            else
//                System.out.println(lines[i]);
        }
//        System.out.println(byteArrayOutputStream);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
