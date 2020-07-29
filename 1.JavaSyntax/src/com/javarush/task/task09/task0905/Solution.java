package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] tracer = Thread.currentThread().getStackTrace();
        int i = 0;
        for (StackTraceElement element : tracer)
                i++;
        System.out.println(i);
        return i;
    }
}

