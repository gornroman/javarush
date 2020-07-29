package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList<Integer>();
//        try {
//            while (true) {
//                array.add(Integer.parseInt(reader.readLine()));
//            }
//        }
//        catch (IOException e)
//        {
//            Iterator i = array.iterator();
//            while (i.hasNext())
//            {
//                System.out.println(i.next());
//            }
//        }
            while (true) {
                try {
                    array.add(Integer.parseInt(reader.readLine()));
                }
                catch (NumberFormatException e)
                {
                    Iterator i = array.iterator();
                    while (i.hasNext())
                    {
                        System.out.println(i.next());
                    }
                    break;
                }
                catch (IOException e)
                {

                }
            }

    }
}
