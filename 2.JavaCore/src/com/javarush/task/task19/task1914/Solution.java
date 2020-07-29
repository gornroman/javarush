package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream out = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        String tmp = byteArrayOutputStream.toString();
        String[] strs = tmp.split(" ");
        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[2]);
        int c = 0;
        if (strs[1].equals("+"))
            c = a + b;
        else if (strs[1].equals("-"))
            c = a - b;
        else
            c = a * b;
        System.setOut(out);
        System.out.println(tmp + c);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

