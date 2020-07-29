package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        t1.start();
        t1.join();
        Read3Strings t2 = new Read3Strings();
        t2.start();
        t2.join();
//        if (!t2.isAlive())
//        {
//            System.out.println(t1);
//            System.out.println(t2);
//        }

        //add your code here - добавьте код тут

        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread {
        private String res = null;

        public void run(){
            String s1 = null, s2 = null, s3 = null;
            try {
                s1 = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                s2 = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                s3 = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            res = s1 + " " + s2 + " " + s3;
        }

        @Override
        public String toString() {
            return res;
        }

        public void printResult(){
            System.out.println(res);
        }
    }
}
