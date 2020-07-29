package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
//        System.out.println(a.length +" " + a[0].length);
        int count = 0;
        if (a[0][0] == 1)
            count++;
        for (int i = 1; i < a[0].length; i++)
        {
            if (a[0][i] == 1 && a[0][i-1] == 0)
                count++;
        }
        for (int i = 1; i < a.length; i++)
        {
            if (a[i][0] == 1 && a[i-1][0] == 0)
                count++;
            for (int j = 1; j < a[i].length; j++)
            {
                if (a[i][j] == 1 && a[i][j-1] == 0 && a[i-1][j] == 0)
                    count++;
            }
        }
        return count;
    }
}
