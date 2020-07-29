package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfathername = reader.readLine();
        Cat grandfather = new Cat(grandfathername);
        System.out.println(grandfather);

        String grandmothername = reader.readLine();
        Cat grandmother = new Cat(grandmothername);
        System.out.println(grandmother);

        String fathername = reader.readLine();
        Cat father = new Cat(fathername, grandfather);
        System.out.println(father);

        String motherName = reader.readLine();
        Cat mother = new Cat(grandmother, motherName);
        System.out.println(mother);

        String sonname = reader.readLine();
        Cat son = new Cat(sonname, father, mother);
        System.out.println(son);

        String daughterName = reader.readLine();
        Cat daughter = new Cat(daughterName, father, mother);
        System.out.println(daughter);

        // System.out.println(grandfather);
        // System.out.println(grandmother);
        // System.out.println(father);
        // System.out.println(mother);
        // System.out.println(son);
        // System.out.println(daughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father) {
            this.name = name;
            this.father = father;
        }

        Cat(Cat mother, String name) {
            this.name = name;
            this.mother = mother;
        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            if (mother == null && father == null)
                return "The cat's name is " + name + ", no mother, no father";
            else
            {
                if (mother == null)
                    return "The cat's name is " + name + ", no mother, father is " + father.name;
                else if (father == null)
                    return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
                else
                    return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
            }
        }
    }
}
