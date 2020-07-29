package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        allLines = Files.readAllLines(Paths.get(name1));
        forRemoveLines = Files.readAllLines(Paths.get(name2));
        solution.joinData();
        reader.close();
    }

    public void joinData() throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
//            for(String s: forRemoveLines)
//            {
//                for(String s2: allLines)
//                {
//                    if (s.equals(s2))
//                        allLines.remove(s);
//                }
//            }
        }
        else
        {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
