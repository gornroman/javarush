package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a < 1)
            throw new NegativeException();
        int b = Integer.parseInt(reader.readLine());
        if (b < 1)
            throw new NegativeException();
//        while a != 0 and b != 0:
//        if a > b:
//        a = a % b
//    else:
//        b = b % a
//
//        print(a + b)
        while (a != 0 && b !=0)
        {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        System.out.println(a + b);
//            ArrayList<Integer> aa = getArr(a);
//            ArrayList<Integer> bb = getArr(b);
//            ArrayList<Integer> cc = new ArrayList<Integer>();
//            for (int i = 0; i < aa.size(); i++)
//            {
//                for (int j = 0; j < bb.size(); j++)
//                {
//                    if (aa.get(i) == bb.get(j))
//                    {
////                        System.out.println("aa[" + i + "] == bb[" + j + "].");
//                        cc.add(aa.get(i));
//                        aa.remove(i);
//                        bb.remove(i);
//                    }
//                }
//            }
//
//            int result = 1;
//            for (int i = 0; i < cc.size(); i++)
//            {
//                result *= cc.get(i);
////                System.out.println(cc.get(i));
//            }
//            System.out.println(result);
////            for (int i = 0; i < bb.size(); i++)
////            {
////                System.out.println(bb.get(i));
////            }
//        reader.close();
    }

    public static ArrayList<Integer> getArr (int a)
    {
        ArrayList<Integer> aa = new ArrayList<Integer>();
        while (a % 2 == 0)
        {
            aa.add(2);
            a /= 2;
        }
        while (a % 3 == 0)
        {
            aa.add(3);
            a /= 3;
        }
        while (a % 5 == 0)
        {
            aa.add(5);
            a /= 5;
        }
        while (a % 7 == 0)
        {
            aa.add(7);
            a /= 7;
        }
        while (a % 11 == 0)
        {
            aa.add(11);
            a /= 11;
        }
        while (a % 13 == 0)
        {
            aa.add(13);
            a /= 13;
        }
        while (a % 17 == 0)
        {
            aa.add(17);
            a /= 17;
        }
        while (a % 19 == 0)
        {
            aa.add(19);
            a /= 19;
        }
        while (a % 23 == 0)
        {
            aa.add(23);
            a /= 23;
        }
        while (a % 29 == 0)
        {
            aa.add(29);
            a /= 29;
        }
        while (a % 31 == 0)
        {
            aa.add(31);
            a /= 31;
        }
        while (a % 37 == 0)
        {
            aa.add(37);
            a /= 37;
        }
        if (a != 1)
            aa.add(a);
        return aa;
    }

    static class NegativeException extends Exception{
        public NegativeException(){
            System.out.println("Not positive numbers.");
        }
    }
}
