package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.*;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new  FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            User tmp = new User();
            tmp.setFirstName("abc");
            tmp.setLastName("qwe");
            tmp.setMale(true);
            tmp.setCountry(User.Country.RUSSIA);
            tmp.setBirthDate(new GregorianCalendar(2020, 01, 1).getTime());
            javaRush.users.add(tmp);
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            if (javaRush.equals(loadedObject))
                System.out.println("equal");
            else
                System.out.println("not");
            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

//    private String firstName;
//    private String lastName;
//    private Date birthDate;
//    private boolean isMale;
//    private User.Country country;

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintStream ps = new PrintStream(outputStream);
            String isListPresent = users.size() != 0 ? "yes" : "no";
            ps.println(isListPresent);
            if (isListPresent.equals("yes"))
            {
                for (int i = 0; i < users.size(); i++)
                {
                    ps.println(users.get(i).getFirstName());
                    ps.println(users.get(i).getLastName());
                    ps.println(users.get(i).getBirthDate().getTime());
                    ps.println(users.get(i).isMale());
                    ps.println(users.get(i).getCountry().toString());
                    System.out.println(users.get(i).getCountry().toString());
                }
            }
            ps.flush();
            ps.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String isListPresent = reader.readLine();
            if (isListPresent.equals("yes"))
            {
                while (reader.ready())
                {
                    User tmp = new User();
                    tmp.setFirstName(reader.readLine());
                    tmp.setLastName(reader.readLine());
                    tmp.setBirthDate(new Date(Long.parseLong(reader.readLine())));
                    tmp.setMale(reader.readLine().equals("true"));
                    tmp.setCountry(User.Country.valueOf(reader.readLine()));
                    this.users.add(tmp);
                }
            }
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
