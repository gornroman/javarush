package com.javarush.task.task17.task1706;

public class OurPresident {
    private static OurPresident president;

    static {
        synchronized(OurPresident.class){
            president = new OurPresident();
        }
    }
    private OurPresident() {
//        synchronized (this){
//            if (president == null){
//                president = new OurPresident();
//                getOurPresident();
//            }
//            else
//                getOurPresident();
//        }
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}
