package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
//        if (clock.isAlive())
            clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            int flag = 0;
            while(numSeconds > 0)
            {
                System.out.print(numSeconds + " ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.print("Прервано!");
                    flag = 1;
                    break;
                }
                numSeconds--;
            }
            if (flag == 0)
                System.out.print("Марш!");
        }
    }
}
