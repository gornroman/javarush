package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(name2));
        BufferedReader filereader = new BufferedReader(new FileReader(name1));
        String num = filereader.readLine();
        String[] nums = num.split(" ");
        for (int i = 0; i < nums.length; i++) {
            writer.write(Math.round(Double.parseDouble(nums[i]))+" ");
        }
        reader.close();
        writer.close();
        filereader.close();
    }
}
