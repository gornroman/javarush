package com.javarush.task.task19.task1904;

/* 
И еще один адаптер
*/

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String s = fileScanner.nextLine();
            String[] data = s.split(" ");  //String firstName, String middleName, String lastName, Date birthDate
            String firstName = data[1];
            String middleName = data[2];
            String lastName = data[0];
            GregorianCalendar calendar = new GregorianCalendar(Integer.parseInt(data[5]), Integer.parseInt(data[4])-1, Integer.parseInt(data[3]));
            Date birthDay = calendar.getTime();
//            Date birthDate = new Date(data[3]);
//            new SimpleDateFormat("dd/MM/yyyy").parse( String.format("%s/%s/%s", data[3], data[4], data[5]);
            Person tmp = new Person(firstName, middleName, lastName, birthDay);
//            Person tmp = new Person(data[0], data[1], data[2], birthDay);
            return tmp;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
