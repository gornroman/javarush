package com.javarush.task.task17.task1707;


public class IMF {

    private static IMF imf = null;

    public static IMF getFund() {
        synchronized (IMF.class){
            if (imf == null){
                imf = new IMF();
                return imf;
            }
            else
                return imf;
        }
//        return imf;
    }

    private IMF() {
    }
}
