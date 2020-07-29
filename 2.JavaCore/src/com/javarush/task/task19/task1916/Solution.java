package com.javarush.task.task19.task1916;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedReader file2 = new BufferedReader(new FileReader(bufferedReader.readLine()));
        bufferedReader.close();
        List<String> f1 = new ArrayList<String>();
        List<String> f2 = new ArrayList<String>();
        String tmp = file1.readLine();
        int i = 0;
        while (tmp != null)
        {
            f1.add(i, tmp);
            i++;
            tmp = file1.readLine();
        }
        tmp = file2.readLine();
        i = 0;
        while (tmp != null)
        {
            f2.add(i, tmp);
            i++;
            tmp = file2.readLine();
        }
        i = 0;
        while (f1.size() > 0 && f2.size() > 0)
        {
            if (f1.get(0).equals(f2.get(0))) {
                lines.add(i, new LineItem(Type.SAME, f1.get(0)));
                f1.remove(0);
                f2.remove(0);
                i++;
            } else if (f1.get(1).equals(f2.get(0))) {
                lines.add(i, new LineItem(Type.REMOVED, f1.get(0)));
                f1.remove(0);
                i++;
            } else {
                lines.add(i, new LineItem(Type.ADDED, f2.get(0)));
                f2.remove(0);
                i++;
            }
        }
        while (f1.size() > 0)
        {
            lines.add(i, new LineItem(Type.REMOVED, f1.get(0)));
            f1.remove(0);
            i++;
        }
        while (f2.size() > 0)
        {
            lines.add(i, new LineItem(Type.ADDED, f2.get(0)));
            f2.remove(0);
            i++;
        }

        file1.close();
        file2.close();
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
