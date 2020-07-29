package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        ArrayList<Character> ch1 = new ArrayList<Character>();
        ArrayList<Character> ch2 = new ArrayList<Character>();
        for (int i = 0; i < str.length(); i++)
        {
            if (isVowel(str.charAt(i)))
            {
                ch1.add(str.charAt(i));
                ch1.add(' ');
            }
            else
            {
                if (str.charAt(i) != ' ')
                {
                    ch2.add(str.charAt(i));
                    ch2.add(' ');
                }
            }

        }
        for (int i = 0; i < ch1.size(); i++)
        {
            System.out.print(ch1.get(i).toString());
        }
        System.out.println("");
        for (int i = 0; i < ch2.size(); i++)
        {
            System.out.print(ch2.get(i).toString());
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}