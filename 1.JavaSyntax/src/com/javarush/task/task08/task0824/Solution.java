package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Human grandp = new Human();
        grandp.name = "ded";
        grandp.age = 100;
        grandp.sex = true;
        grandp.children = new ArrayList<Human>(1);

        Human grandp2 = new Human();
        grandp2.name = "ded2";
        grandp2.age = 100;
        grandp2.sex = true;
        grandp2.children = new ArrayList<Human>(1);

        Human grandm = new Human();
        grandm.name = "bab";
        grandm.age = 100;
        grandm.sex = false;
        grandm.children = new ArrayList<Human>(1);

        Human grandm2 = new Human();
        grandm2.name = "bab2";
        grandm2.age = 100;
        grandm2.sex = false;
        grandm2.children = new ArrayList<Human>(1);

        Human father = new Human();
        father.name = "father";
        father.age = 50;
        father.sex = true;
        father.children = new ArrayList<Human>(3);

        Human mother = new Human();
        mother.name = "mother";
        mother.age = 50;
        mother.sex = false;
        mother.children = new ArrayList<Human>(3);

        Human child1 = new Human();
        child1.name = "child1";
        child1.age = 1;
        child1.sex = true;
        child1.children = new ArrayList<Human>(0);

        Human child2 = new Human();
        child2.name = "child2";
        child2.age = 2;
        child2.sex = false;
        child2.children = new ArrayList<Human>(0);

        Human child3 = new Human();
        child3.name = "child3";
        child3.age = 3;
        child3.sex = true;
        child3.children = new ArrayList<Human>(0);

        grandp.children.add(father);
        grandm.children.add(father);

        grandp2.children.add(mother);
        grandm2.children.add(mother);

        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);

        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);

        System.out.println(grandp.toString());
        System.out.println(grandp2.toString());
        System.out.println(grandm.toString());
        System.out.println(grandm2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
