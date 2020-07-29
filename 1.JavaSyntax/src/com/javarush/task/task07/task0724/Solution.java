package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandf = new Human("anna", true, 10);
        Human grandf2 = new Human("anna2", true, 110);
        Human grandm = new Human("anna3", false, 130);
        Human grandm2 = new Human("anna4", true, 102);
        Human father = new Human("anna4", true, 102, grandf, grandm);
        Human mother = new Human("anna4", true, 102, grandf2, grandm);
        Human child1 = new Human("anna4", true, 102, grandf2, grandm);
        Human child2 = new Human("anna4", true, 102, grandf, grandm2);
        Human child3 = new Human("anna4", true, 102, grandf, grandm2);

        System.out.println(grandf.toString());
        System.out.println(grandf2.toString());
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
        public Human father;
        public Human mother;

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}