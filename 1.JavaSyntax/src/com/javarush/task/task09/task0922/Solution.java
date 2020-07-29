package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        // Date date = new Date();

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int year = cal.get(Calendar.YEAR);
        String [] arr = new String[12];
        arr[0] = "JAN";
        arr[1] = "FEB";
        arr[2] = "MAR";
        arr[3] = "APR";
        arr[4] = "MAY";
        arr[5] = "JUN";
        arr[6] = "JUL";
        arr[7] = "AUG";
        arr[8] = "SEP";
        arr[9] = "OCT";
        arr[10] = "NOV";
        arr[11] = "DEC";
        System.out.println(arr[month] + " " + day + ", " + year);
    }
}
