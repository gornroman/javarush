package com.javarush.task.task17.task1711;

import java.text.FieldPosition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        if(args.length > 0)
        {
            int i = 1;
            switch (args[0]){
                case ("-d"):
                    synchronized (allPeople){
                        while(i < args.length)
                        {
                            allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);
                            allPeople.get(Integer.parseInt(args[i])).setName(null);
                            allPeople.get(Integer.parseInt(args[i])).setSex(null);
                            i++;
                        }
                    }
                    break;
                case ("-i"):
                    synchronized (allPeople)
                    {
                        while(i < args.length)
                        {
                            StringBuffer stringBuffer = new StringBuffer();
                            Date now = allPeople.get(Integer.parseInt(args[i])).getBirthDate();
                            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("dd-MMM-yyyy");
                            simpleDateFormat3.format(now, stringBuffer, new FieldPosition(0));
                            String pol = null;
                            if (allPeople.get(Integer.parseInt(args[i])).getSex().equals(Sex.MALE))
                                pol = "м";
                            else
                                pol = "ж";
                            System.out.println(allPeople.get(Integer.parseInt(args[i])).getName() + " " + pol + " " + stringBuffer);
                            i++;
                        }
                    }
                    break;
                case ("-c"):
                    synchronized (allPeople){
                        while(i < args.length)
                        {
                            if(args[i + 1].equals("м"))
                            {
                                Date datetmp = simpleDateFormat.parse(args[i + 2]);
                                Person tmp = Person.createMale(args[i], datetmp);
                                allPeople.add(tmp);
                                System.out.println(allPeople.size() - 1);
                            }
                            else
                            {
                                Date datetmp = simpleDateFormat.parse(args[i + 2]);
                                Person tmp = Person.createFemale(args[i], datetmp);
                                allPeople.add(tmp);
                                System.out.println(allPeople.size() - 1);
                            }
                            i += 3;
                        }
                    }
                    break;
                case ("-u"):
                    synchronized (allPeople){
                        while(i < args.length)
                        {
                            Date datetmp = simpleDateFormat.parse(args[i + 3]);
                            allPeople.get(Integer.parseInt(args[i])).setBirthDate(datetmp);
                            allPeople.get(Integer.parseInt(args[i])).setName(args[i + 1]);
                            if (args[i + 2].equals("ж"))
                                allPeople.get(Integer.parseInt(args[i])).setSex(com.javarush.task.task17.task1711.Sex.FEMALE);
                            else
                                allPeople.get(Integer.parseInt(args[i])).setSex(com.javarush.task.task17.task1711.Sex.MALE);
                            i += 4;
                        }
                    }
                    break;
            }
//
//            if(args[0].equals("-d"))
//            {
//                int i = 1;
//                while(i < args.length)
//                {
//                    allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);
//                    allPeople.get(Integer.parseInt(args[i])).setName(null);
//                    allPeople.get(Integer.parseInt(args[i])).setSex(null);
//                    i++;
//                }
//            }
//            else if (args[0].equals("-i"))
//            {
//                int i = 1;
//                while(i < args.length)
//                {
//                    StringBuffer stringBuffer = new StringBuffer();
//                    Date now = allPeople.get(Integer.parseInt(args[i])).getBirthDate();
//                    SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("dd-MMM-yyyy");
//                    simpleDateFormat3.format(now, stringBuffer, new FieldPosition(0));
//                    String pol = null;
//                    if (allPeople.get(Integer.parseInt(args[i])).getSex().equals(Sex.MALE))
//                        pol = "м";
//                    else
//                        pol = "ж";
//                    System.out.println(allPeople.get(Integer.parseInt(args[i])).getName() + " " + pol + " " + stringBuffer);
//                    i++;
//                }
//            }
//            else if(args[0].equals("-c"))
//            {
//                int i = 1;
//                while(i < args.length)
//                {
//                    if(args[i + 1].equals("м"))
//                    {
//                        Date datetmp = simpleDateFormat.parse(args[i + 2]);
//                        Person tmp = Person.createMale(args[i], datetmp);
//                        allPeople.add(tmp);
//                        System.out.println(allPeople.size() - 1);
//                    }
//                    else
//                    {
//                        Date datetmp = simpleDateFormat.parse(args[i + 2]);
//                        Person tmp = Person.createFemale(args[i], datetmp);
//                        allPeople.add(tmp);
//                        System.out.println(allPeople.size() - 1);
//                    }
//                    i += 3;
//                }
//            }
//            else if(args[0].equals("-u"))
//            {
//                int i = 1;
//                while(i < args.length)
//                {
//                    Date datetmp = simpleDateFormat.parse(args[i + 3]);
//                    allPeople.get(Integer.parseInt(args[i])).setBirthDate(datetmp);
//                    allPeople.get(Integer.parseInt(args[i])).setName(args[i + 1]);
//                    if (args[i + 2].equals("ж"))
//                        allPeople.get(Integer.parseInt(args[i])).setSex(com.javarush.task.task17.task1711.Sex.FEMALE);
//                    else
//                        allPeople.get(Integer.parseInt(args[i])).setSex(com.javarush.task.task17.task1711.Sex.MALE);
//                    i += 4;
//                }
//            }
        }
    }
}
