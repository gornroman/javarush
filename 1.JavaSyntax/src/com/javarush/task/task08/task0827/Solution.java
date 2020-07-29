package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMMMMM dd yyyy", Locale.ENGLISH);
        cal.setTime(sdf.parse(date));// all done
        int daysThisYear = cal.get(Calendar.DAY_OF_YEAR);
        if (daysThisYear % 2 == 0)
            return false;
        else
            return true;
    }
}
