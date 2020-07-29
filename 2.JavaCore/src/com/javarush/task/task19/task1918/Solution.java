package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(bufferedReader.readLine()));
        bufferedReader.close();
        StringBuilder stringBuilder = new StringBuilder();
        String temp = file.readLine();
        while (temp != null)
        {
            stringBuilder.append(temp);
            temp = file.readLine();
        }
        file.close();
        String opened = "<" + args[0];
        String closed = "</" + args[0] + ">";
        String allText = stringBuilder.toString();

        int tempStartIndex = 0;
        int startIndex;
        int endIndex;

        while (tempStartIndex != -1)
        {
            startIndex = allText.indexOf(opened, tempStartIndex);
            if (startIndex == -1)
                return;
            endIndex = allText.indexOf(closed, startIndex);
            tempStartIndex = allText.indexOf(opened, startIndex + 1);
            if (tempStartIndex < endIndex && tempStartIndex != -1)
            {
                endIndex = allText.indexOf(closed, endIndex + 1);
            }
            System.out.println(allText.substring(startIndex, endIndex + closed.length()));
        }

//        String test = "Info about Leela <span xml:lang=\"en\" lang=\"en\"><b><span>Turanga Leela\n </span></b></span><span>Super</span><span>girl</span>qwerty";
//        test = test.replaceAll("\\n", "").replaceAll("\\r", "");
//
//        String tmp = test.substring(test.indexOf(opened), test.lastIndexOf(closed) + 3 + args[0].length());
//        System.out.println("TEST:" + test);
//        System.out.println("NEW:" + tmp);
//
//        String tmp1 = tmp.substring(1, tmp.length()-1);
//        System.out.println("TEST2:" + tmp1);
//        String tmp2 = tmp1.substring(tmp1.indexOf(opened), tmp1.lastIndexOf(closed) + 3 + args[0].length());
//        System.out.println("NEW2:" + tmp2);
    }
}
