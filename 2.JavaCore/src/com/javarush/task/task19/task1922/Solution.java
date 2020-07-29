package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        bufferedReader.close();
        String data = fileReader.readLine();
        List <String> listOfWords = new ArrayList<>();
        while (data != null)
        {
            int counter = 0;
            for (int i = 0; i < words.size(); i++)
            {
                String[] lines = data.split(" ");
                for (int j = 0; j < lines.length; j++)
                {
                    if (words.get(i).equals(lines[j]))
                        counter++;
                }
            }
            if (counter == 2)
                listOfWords.add(data);
            data = fileReader.readLine();
        }
        for (int a = 0; a < listOfWords.size(); a++)
            System.out.println(listOfWords.get(a));
        fileReader.close();
    }
}
