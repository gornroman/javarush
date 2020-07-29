package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        while (true)
        {
            String str = reader.readLine();
            if (str.equals("user"))
            {
                person = new Person.User();
                doWork(person);
            }
            else if (str.equals("loser"))
            {
                person = new Person.Loser();
                doWork(person);
            }
            else if (str.equals("coder"))
            {
                person = new Person.Coder();
                doWork(person);
            }
            else if (str.equals("proger"))
            {
                person = new Person.Proger();
                doWork(person);
            }
            else
                break ;
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User)
        {
            Person.User pu = (Person.User)person;
            pu.live();
        }
        if (person instanceof Person.Loser)
        {
            Person.Loser pl = (Person.Loser)person;
            pl.doNothing();
        }
        if (person instanceof Person.Coder)
        {
            Person.Coder pc = (Person.Coder)person;
            pc.writeCode();
        }
        if (person instanceof Person.Proger)
        {
            Person.Proger pp = (Person.Proger)person;
            pp.enjoy();
        }
    }
}
