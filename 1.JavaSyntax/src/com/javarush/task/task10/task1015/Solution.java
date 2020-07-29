package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.List;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
//        ArrayList<String[]> arr = new ArrayList<String[]>();
        ArrayList<String>[] arr = new ArrayList[1];
        ArrayList<String> subarr = new ArrayList<String>();
        subarr.add("abc");
        subarr.add("abce");
        subarr.add("abcd");
        arr[0] = subarr;
        return (arr);
    }


    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}