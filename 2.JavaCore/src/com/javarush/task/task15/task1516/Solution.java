package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    public static void main(String[] args) {
//        Solution sol = new Solution();
        System.out.println(new Solution().intVar + " " + new Solution().doubleVar + " " + new Solution().DoubleVar + " " + new Solution().booleanVar + " " + new Solution().ObjectVar + " " + new Solution().ExceptionVar + " " + new Solution().StringVar);
//        System.out.println(sol.doubleVar);
//        System.out.println(sol.DoubleVar);
//        System.out.println(sol.booleanVar);
//        System.out.println(sol.ObjectVar);
//        System.out.println(sol.ExceptionVar);
//        System.out.println(sol.StringVar);
    }
}
