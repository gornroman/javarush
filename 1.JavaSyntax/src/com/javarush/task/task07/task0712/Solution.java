package com.javarush.task.task07.task0712;

import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxi = -1;
        int mini = -1;
        int min = 2147483647;
        int max = -2147483648;
        for(int i = 0; i < 10; i++)
        {
            list.add(reader.readLine());
            if (list.get(i).length() > max)
            {
                max = list.get(i).length();
                maxi = i;
            }
            if (list.get(i).length() < min)
            {
                min = list.get(i).length();
                mini = i;
            }
        }
        if (maxi < mini)
            System.out.println(list.get(maxi));
        else
            System.out.println(list.get(mini));

    }
}
