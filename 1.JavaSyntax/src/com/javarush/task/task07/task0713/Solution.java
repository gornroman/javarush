package com.javarush.task.task07.task0713;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr0 = new ArrayList<Integer>();
        ArrayList<Integer> arr3 = new ArrayList<Integer>(); //%3
        ArrayList<Integer> arr2 = new ArrayList<Integer>(); //%2
        ArrayList<Integer> arr1 = new ArrayList<Integer>(); //rest
        for (int i = 0; i < 20; i++)
        {
            arr0.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < 20; i++)
        {
            if (arr0.get(i) % 3 == 0 || arr0.get(i) % 2 == 0)
            {
                if (arr0.get(i) % 3 == 0)
                    arr3.add(arr0.get(i));
                if (arr0.get(i) % 2 == 0)
                    arr2.add(arr0.get(i));
            }
            else
                arr1.add(arr0.get(i));
        }
        Solution.printList(arr3);
        Solution.printList(arr2);
        Solution.printList(arr1);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
