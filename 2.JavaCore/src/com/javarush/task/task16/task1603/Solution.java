package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread st1 = new SpecialThread();
        Thread t1 = new Thread(st1);

        SpecialThread st2 = new SpecialThread();
        Thread t2 = new Thread(st2);

        SpecialThread st3 = new SpecialThread();
        Thread t3 = new Thread(st3);

        SpecialThread st4 = new SpecialThread();
        Thread t4 = new Thread(st4);

        SpecialThread st5 = new SpecialThread();
        Thread t5 = new Thread(st5);

        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.add(t5);
        //Add your code here - добавьте свой код тут
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
