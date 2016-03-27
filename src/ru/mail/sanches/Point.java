package ru.mail.sanches;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class Point {
    static int x;
    static int y;
    static int ch = 1000000;

    public static void point() {
        Random random = new Random();
        SortedSet<Integer> intsetx = new TreeSet<Integer>();
        SortedSet<Integer> intsetxc = new TreeSet<Integer>();
        SortedSet<Integer> intsety = new TreeSet<Integer>();
        SortedSet<Integer> intsetyc = new TreeSet<Integer>();

        for (int k = 0; k < ch; k++) {
            x = random.nextInt(100);
            intsetx.add(x);
        }
        for(int k = 0; k < intsetx.toArray().length; k++) {
            if (((int)intsetx.toArray()[k] > 54) && ((int)intsetx.toArray()[k] < 58)) {
                intsetxc.add((Integer) intsetx.toArray()[k]);
            }
        }
        System.out.println(intsetxc);

        for(int k = 0; k < ch; k++){
            y = random.nextInt(100);
            intsety.add(y);
        }

        for(int k = 0; k < intsety.toArray().length; k++) {
            if (((int)intsety.toArray()[k] > 54) && ((int)intsety.toArray()[k] < 58)) {
                intsetyc.add((Integer) intsety.toArray()[k]);
            }
        }
        System.out.println(intsetyc);
    }
}



