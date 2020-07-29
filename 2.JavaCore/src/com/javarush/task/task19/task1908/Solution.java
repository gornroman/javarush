package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        String str = fileReader.readLine();
//        String str = "12 text var2 14 8ю 1";
        while (str != null)
        {
            String[] tmp = str.split(" ");
            String ans = null;
            int i = 0;
            int flag = 0;
            while (i < tmp.length)
            {
                if (tmp[i].matches("^[0-9]*$"))
                {
                    if (ans == null)
                        ans = tmp[i] + " ";
                    else
                        ans = ans + tmp[i] + " ";
                    flag = 1;
//                    System.out.println("ans: " + ans);
                }
                i++;
            }
            if (flag == 1)
                fileWriter.write(ans);
            str = fileReader.readLine();
        }
        fileReader.close();
        fileWriter.close();
    }
}
