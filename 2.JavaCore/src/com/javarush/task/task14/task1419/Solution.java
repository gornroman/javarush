package com.javarush.task.task14.task1419;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
//        try {
//            float i = 1 / 0;
//
//        } catch (Exception e) {
//            exceptions.add(e);
//        }
//
//        try {
//            File file = new File("E://file.txt");
//            FileReader fr = new FileReader(file);
//
//        } catch (Exception e) {
//            exceptions.add(e);
//        }
//
//        try {
//            int num[] = {1, 2, 3, 4};
//            System.out.println(num[5]);
//
//        } catch (Exception e) {
//            exceptions.add(e);
//        }

        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new NullPointerException());
        exceptions.add(new ClassCastException());
        exceptions.add(new ArithmeticException());
        exceptions.add(new NoSuchMethodException());
        exceptions.add(new NoSuchFieldException());
        exceptions.add(new InstantiationException());

        exceptions.add(new ClassNotFoundException());
        exceptions.add(new IllegalAccessException());
        exceptions.add(new CloneNotSupportedException());

    }
}
