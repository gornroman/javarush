package com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace
StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements)
    {
       System.out.println(element.getMethodName());
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;
    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack;
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack;
    }

    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack;
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack;
    }
}
