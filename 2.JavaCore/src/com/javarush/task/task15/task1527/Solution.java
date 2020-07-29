package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String str2 = str.substring(str.indexOf("?") + 1);
//        System.out.println(str2);
        if (str2.contains("obj"))
        {
            String tmp11 = str2.substring(str2.indexOf("obj") + 4);
            int end = 0;
            for (int a = 0; a < tmp11.length(); a++)
            {
                if (tmp11.charAt(a) == '&')
                {
                    end = a;
                    a = tmp11.length()-1;
                }
            }
            String objstr = tmp11.substring(0, end);

            int i = 0;
            while (isLetter(str2.charAt(i)))
                i++;
            String str3 = str2.substring(0, i);
            System.out.print(str3 + " ");
            String str4 = str2.substring(i + 1);
//            System.out.println(str4);
            for (int a = 0; a < str4.length(); a++)
            {
//                System.out.println("char: " + str4.charAt(a));
                if (str4.charAt(a) == '&')
                {
                    a++;
                    int tmp1 = a;
                    while (isLetter(str4.charAt(a)))
                    {
                        a++;
//                    System.out.println(a);
                        if (a >= str4.length())
                        {
//                        a--;
                            break;
                        }
                    }
//                    System.out.println("tmp1: " + tmp1 + ", a: " + a + ", len: " + str4.length());
//                    if (a < str4.length())
//                        System.out.println("char2: " + str4.charAt(a));
                    if (tmp1 != a)
                    {
                        String tmp = str4.substring(tmp1, a);
                        System.out.print(tmp + " ");
                        a--;
                    }
                }
            }

            if (isDouble(objstr))
            {
                System.out.println("");
                Double dbl = Double.parseDouble(objstr);
                alert(dbl);
            }
            else
            {
                System.out.println("");
                alert(objstr);
            }
//            System.out.println(objstr);
        }
        else
        {
            int i = 0;
            while (isLetter(str2.charAt(i)))
                i++;
            String str3 = str2.substring(0, i);
            System.out.print(str3 + " ");
            String str4 = str2.substring(i + 1);
//            System.out.println(str4);
            for (int a = 0; a < str4.length(); a++)
            {
//                System.out.println("char: " + str4.charAt(a));
                if (str4.charAt(a) == '&')
                {
                    a++;
                    int tmp1 = a;
                    while (isLetter(str4.charAt(a)))
                    {
                        a++;
//                    System.out.println(a);
                        if (a >= str4.length())
                        {
//                        a--;
                            break;
                        }
                    }
//                    System.out.println("tmp1: " + tmp1 + ", a: " + a + ", len: " + str4.length());
//                    if (a < str4.length())
//                        System.out.println("char2: " + str4.charAt(a));
                    if (tmp1 != a)
                    {
                        String tmp = str4.substring(tmp1, a);
                        System.out.print(tmp + " ");
                        a--;
                    }
                }
            }
        }
    }

    public static boolean isDouble (String str)
    {
        try
        {
            Double.parseDouble(str);
        }
        catch (NumberFormatException e)
        {
            return false;
        }
        return true;
    }

    public static boolean isLetter(char c)
    {
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
            return true;
        else
            return false;
    }
    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
