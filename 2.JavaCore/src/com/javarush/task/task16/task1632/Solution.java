package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new th1());
        threads.add(new th2());
        threads.add(new th3());
        threads.add(new th4());
        threads.add(new th5());
    }
    public static void main(String[] args) {

    }

    public static class th1 extends Thread {
        public void run(){
            while(true){

            }
        }
    }

    public static class th2 extends Thread {
        public void run(){
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");;
            }
        }
    }

    public static class th3 extends Thread {
        public void run(){
            while(true){
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static class th4 extends Thread implements Message {
        public void run(){
            while (!this.isInterrupted()){
            }
        }
        public void showWarning(){
            this.interrupt();
        }
    }

    public static class th5 extends Thread {
        public void run(){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = null;
            Integer n = 0;
            while (true)
            {
                try {
                    str = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (str.equals("N"))
                    break;
                n += Integer.parseInt(str);
            }
            System.out.println(n);
        }
    }
}