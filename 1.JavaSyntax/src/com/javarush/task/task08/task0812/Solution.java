package com.javarush.task.task08.task0812;

import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> arr = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
            arr.add(Integer.parseInt(reader.readLine()));
        int x = 0;
        int max = 0;
        for (int i = 0; i < arr.size(); i++)
        {
            if (i == 0)
            {
                x = 1;
                max = x;
            }
            else
            {
                if (arr.get(i).equals(arr.get(i - 1)))
                {
//                    System.out.println("prev int: " + arr.get(i-1) + ", curr int: " + arr.get(i) + ", x: " + x + ", max: " + max + ", i: " + i);
                    x++;
                    if (x > max)
                        max = x;
//                    System.out.println("new x: " + x + ", new max: " + max);
                }
                else
                {
                    x = 1;
//                    System.out.println("prev int: " + arr.get(i-1) + ", curr int: " + arr.get(i) + ", x: " + x + ", max: " + max + ", i: " + i);
                }
            }
        }
        // if (max == 0)
        //     max = 1;
        System.out.println(max);
    }
}