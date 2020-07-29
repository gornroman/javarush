package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String str = reader.readLine();
            if (str.equals("exit"))
                break;
            if (str.contains(".") && isDouble(str))
            {
                Double dbl = Double.parseDouble(str);
                print(dbl);
            }
            else if (isShort(str) && Short.parseShort(str) > 0 && Short.parseShort(str) < 128)
            {
                short srt = Short.parseShort(str);
                print(srt);
            }
            else if (isInt(str) && (Integer.parseInt(str) <= 0 || Integer.parseInt(str) >= 128))
            {
                Integer ind = Integer.parseInt(str);
                print(ind);
            }
            else
                print(str);
        }
        reader.close();
    }

    private static boolean isDouble(String arg) {
        try {
            Double d = Double.parseDouble(arg);
            return true;
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
    }

    private static boolean isShort(String arg) {
        try {
            Short d = Short.parseShort(arg);
            return true;
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
    }

    private static boolean isInt(String arg) {
        try {
            Integer d = Integer.parseInt(arg);
            return true;
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
