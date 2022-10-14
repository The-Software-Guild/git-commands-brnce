package com.sg.foundations.flowcontrol.whiles;

public class StayPositive {
    public static void main(String args[]) {
        //loop counter initialisation
        int i = 0;

        System.out.println("Counting down...");

        //loop to print 0 to 10.
        while (i <= 10 && i >= 0) {
            System.out.println(i);
            ++i;
        }
        System.out.println("Blast off!");
    }
}
