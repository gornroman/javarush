package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    int getCountOfEggsPerMonth(){
        return 2;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - Ukraine. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}