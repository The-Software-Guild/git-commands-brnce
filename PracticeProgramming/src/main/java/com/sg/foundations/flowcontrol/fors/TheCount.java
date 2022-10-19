package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TheCount {
    public static void main(String[] args) {

        int timesPrinted = 0;
        Scanner sc = new Scanner(System.in);

        int start;
        int end;
        int increment;

        System.out.print("*** I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU! ***\n");
        System.out.print("Start at: ");
        start = sc.nextInt();
        System.out.print("Stop at: ");
        end = sc.nextInt();
        System.out.println("Count by: ");
        increment = sc.nextInt();

        for (int i = start; i <= end; i += increment){
            System.out.print(i + " ");
            timesPrinted++;
            if (timesPrinted % 3 == 0){
                System.out.print(" - Ah ah ah! \n");

            }
        }
    }
}