package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private static int number = 0;
        private Human father;
        private Human mother;

        public Human(int age){
            number++;
        }

        public Human(String name)
        {
            this.name = name;
            number++;
        }

        public Human(String name, int age)
        {
            this.name = name;
            this.age = age;
            number++;
        }

        public Human(String name, int age, boolean sex)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            number++;
        }

        public Human(String name, int age, Human father, boolean sex)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = (Human)father;
            number++;
        }

        public Human(String name, int age, boolean sex, Human mother)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            number++;
        }

        public Human(String name, int age, boolean sex, Human mother, Human father)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.father = father;
            number++;
        }

        public Human(String name, int age, boolean sex, Human mother, Human father, Human grandmother)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.father = father;
            number++;
        }

        public Human(String name, Human grandfather, int age, boolean sex, Human mother, Human father)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.father = father;
            number++;
        }

        public Human(String name, int age, boolean sex, Human mother, Human father, Human grandfather, Human grandmother)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.father = father;
            number++;
        }
    }

}
