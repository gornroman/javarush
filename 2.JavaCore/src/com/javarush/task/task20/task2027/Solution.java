package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/* 
Кроссворд
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
//        int[][] crossword = new int[][]{
//                {'f', 'd', 'e', 'r', 'l', 'k'},
//                {'u', 's', 'a', 'm', 'e', 'o'},
//                {'l', 'n', 'g', 'r', 'o', 'v'},
//                {'m', 'l', 'p', 'r', 'r', 'h'},
//                {'p', 'o', 'e', 'e', 'j', 'j'}
//        };
//        detectAllWords(crossword, "home", "same");
        System.out.println(detectAllWords(crossword, "home", "same"));
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> result = new ArrayList<>();
        for (int w = 0; w < words.length; w++)
        {
            int found = 0;
            int i = 0;
            while (i < crossword.length && found == 0)
            {
                int j = 0;
                while (j < crossword[i].length && found == 0)
                {
                    if (crossword[i][j] == words[w].charAt(0))  // нашли первую букву слова
                    {
//                        System.out.println(words[w] + ", letter: " + (char)crossword[i][j]);
                        if (j + 1 >= words[w].length() && found == 0)
                        {
//                            System.out.println("поищем слева");
                            int len = words[w].length();
                            int letter = 1;
                            found = 1;
                            while (letter < len && found == 1)
                            {
                                if (crossword[i][j - letter] != words[w].charAt(letter))
                                    found = 0;
                                letter++;
                            }
                            if (found == 1)
                            {
                                Word tmp = new Word(words[w]);
                                tmp.startX = j;
                                tmp.startY = i;
                                tmp.endX = j + 1 - words[w].length();
                                tmp.endY = tmp.startY;
                                result.add(tmp);
                            }
                            if (i + 1 >= words[w].length() && found == 0)
                            {
//                                System.out.println("поищем слева-вверх");
                                len = words[w].length();
                                letter = 1;
                                found = 1;
                                while (letter < len && found == 1)
                                {
                                    if (crossword[i - letter][j - letter] != words[w].charAt(letter))
                                        found = 0;
                                    letter++;
                                }
                                if (found == 1)
                                {
                                    Word tmp = new Word(words[w]);
                                    tmp.startX = j;
                                    tmp.startY = i;
                                    tmp.endX = j + 1 - words[w].length();
                                    tmp.endY = i + 1 - words[w].length();
                                    result.add(tmp);
                                }
                            }
                        }
                        if (i + 1 >= words[w].length() && found == 0)
                        {
//                            System.out.println("поищем сверху");
                            int len = words[w].length();
                            int letter = 1;
                            found = 1;
                            while (letter < len)
                            {
                                if (crossword[i - letter][j] != words[w].charAt(letter))
                                    found = 0;
                                letter++;
                            }
                            if (found == 1)
                            {
                                Word tmp = new Word(words[w]);
                                tmp.startX = j;
                                tmp.startY = i;
                                tmp.endX = tmp.startX;
                                tmp.endY = i + 1 - words[w].length();
                                result.add(tmp);
                            }
                            if (crossword[i].length - j >= words[w].length() && found == 0)
                            {
//                                System.out.println("поищем cверху-справа");
                                len = words[w].length();
                                letter = 1;
                                found = 1;
                                while (letter < len)
                                {
                                    if (crossword[i - letter][j + letter] != words[w].charAt(letter))
                                        found = 0;
                                    letter++;
                                }
                                if (found == 1)
                                {
                                    Word tmp = new Word(words[w]);
                                    tmp.startX = j;
                                    tmp.startY = i;
                                    tmp.endX = j - 1 + words[w].length();
                                    tmp.endY = i + 1 - words[w].length();
                                    result.add(tmp);
                                }
                            }
                        }
                        if (crossword[i].length - j >= words[w].length() && found == 0)
                        {
//                            System.out.println("поищем справа");
                            int len = words[w].length();
                            int letter = 1;
                            found = 1;
                            while (letter < len && found == 1)
                            {
                                if (crossword[i][j + letter] != words[w].charAt(letter))
                                    found = 0;
                                letter++;
                            }
                            if (found == 1) {
                                Word tmp = new Word(words[w]);
                                tmp.startX = j;
                                tmp.startY = i;
                                tmp.endX = j + words[w].length() - 1;
                                tmp.endY = tmp.startY;
                                result.add(tmp);
                            }
                            if (crossword.length - i >= words[w].length() && found == 0)
                            {
//                                System.out.println("поищем справа-снизу");
                                len = words[w].length();
                                letter = 1;
                                found = 1;
                                while (letter < len && found == 1)
                                {
                                    if (crossword[i + letter][j + letter] != words[w].charAt(letter))
                                        found = 0;
                                    letter++;
                                }
                                if (found == 1) {
                                    Word tmp = new Word(words[w]);
                                    tmp.startX = j;
                                    tmp.startY = i;
                                    tmp.endX = j + words[w].length() - 1;
                                    tmp.endY = i + words[w].length() - 1;
                                    result.add(tmp);
                                }
                            }
                        }
                        if (crossword.length - i >= words[w].length() && found == 0)
                        {
//                            System.out.println("поищем внизу");
                            int len = words[w].length();
                            int letter = 1;
                            found = 1;
                            while (letter < len)
                            {
                                if (crossword[i + letter][j] != words[w].charAt(letter))
                                    found = 0;
                                letter++;
                            }
                            if (found == 1)
                            {
                                Word tmp = new Word(words[w]);
                                tmp.startX = j;
                                tmp.startY = i;
                                tmp.endX = tmp.startX;
                                tmp.endY = i + words[w].length() - 1;
                                result.add(tmp);
                            }
                            if (j + 1 >= words[w].length() && found == 0)
                            {
//                                System.out.println("поищем внизу-слева");
                                len = words[w].length();
                                letter = 1;
                                found = 1;
                                while (letter < len && found == 1)
                                {
                                    if (crossword[i + letter][j - letter] != words[w].charAt(letter))
                                        found = 0;
                                    letter++;
                                }
                                if (found == 1)
                                {
                                    Word tmp = new Word(words[w]);
                                    tmp.startX = j;
                                    tmp.startY = i;
                                    tmp.endX = j + 1 - words[w].length();
                                    tmp.endY = i + words[w].length() - 1;
                                    result.add(tmp);
                                }
                            }
                        }
                    }
                    j++;
                }
                i++;
            }
        }
        return result;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
