package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        String line;
        List<Integer> list = new LinkedList<>();
        if (fileReader.ready())
            while ((line = fileReader.readLine()) != null) {
                list.add(Integer.valueOf(line));
            }

        list.stream().filter(v -> v % 2 == 0).sorted().forEach(System.out::println);

        reader.close();
        fileReader.close();
    }
}
//{
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName = reader.readLine();
//        FileInputStream input = new FileInputStream(fileName);
//        ArrayList<Integer> array = new ArrayList<Integer>();
//        while (input.available() > 0)
//        {
//            int i = input.read();
//            if (i % 2 == 0)
//                array.add(i);
//        }
//        Collections.sort(array);
//        for (int i = 0; i < array.size(); i++)
//        {
//            System.out.println(array.get(i));
//        }
////        Integer[] array2 = new Integer[array.size()];
////        array2 = array.toArray(array2);
////        Arrays.sort(array2);
////        for (int i = 0; i < array2.length; i++)
////        {
////            System.out.println(array2[i]);
////        }
//        reader.close();
//        input.close();
//    }
//}
