package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        String data = fileReader.readLine();
        while (data != null)
        {
            String[] lines = data.split(" ");
            StringBuilder stringBuilder = new StringBuilder();
            int i = 0;
            while (i < lines.length - 3)
            {
                stringBuilder.append(lines[i] + " ");
                i++;
            }
            int day = Integer.parseInt(lines[i]);
            int month = Integer.parseInt(lines[i + 1]);
            int year = Integer.parseInt(lines[i + 2]);
            Date date = new GregorianCalendar(year, month - 1, day).getTime();
            PEOPLE.add(new Person(stringBuilder.toString().trim(), date));
//            System.out.println(stringBuilder.toString().trim() + "\nday:" + day + ", month:" + month + ", year:" + year);
            data = fileReader.readLine();
        }
        fileReader.close();
    }
}
