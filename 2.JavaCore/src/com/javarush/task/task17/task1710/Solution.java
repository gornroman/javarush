package com.javarush.task.task17.task1710;

import java.text.FieldPosition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        if(args.length > 0)
        {
            if(args.length == 2)
            {
                if(args[0].equals("-d"))
                {
                    allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
                    allPeople.get(Integer.parseInt(args[1])).setName(null);
                    allPeople.get(Integer.parseInt(args[1])).setSex(null);
                }
                else if (args[0].equals("-i"))
                {
                    StringBuffer stringBuffer = new StringBuffer();
                    Date now = allPeople.get(Integer.parseInt(args[1])).getBirthDate();
                    SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("dd-MMM-yyyy");
                    simpleDateFormat3.format(now, stringBuffer, new FieldPosition(0));
                    String pol = null;
                    if (allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.MALE))
                        pol = "м";
                    else
                        pol = "ж";
                    System.out.println(allPeople.get(Integer.parseInt(args[1])).getName() + " " + pol + " " + stringBuffer);
                }
            }
            else if(args.length == 4 && args[0].equals("-c"))
            {
                if(args[2].equals("м"))
                {
                    Date datetmp = simpleDateFormat.parse(args[3]);
                    Person tmp = Person.createMale(args[1], datetmp);
                    allPeople.add(tmp);
                    System.out.println(allPeople.size() - 1);
                }
                else
                {
                    Date datetmp = simpleDateFormat.parse(args[3]);
                    Person tmp = Person.createFemale(args[1], datetmp);
                    allPeople.add(tmp);
                    System.out.println(allPeople.size() - 1);
                }
            }
            else if(args.length == 5 && args[0].equals("-u"))
            {
                Date datetmp = simpleDateFormat.parse(args[4]);
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(datetmp);
                allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
                if (args[3].equals("ж"))
                    allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
                else
                    allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
            }
        }
    }
}
