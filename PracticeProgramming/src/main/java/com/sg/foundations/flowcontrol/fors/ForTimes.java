package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class ForTimes {
    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Which times table shall I recite? ");
        number = sc.nextInt();

        for (int i = 1; i < 16; i ++) {
            System.out.println(i + " * " + number + " is: " +  (i * number));

        }


    }
}