package com.sg.foundations.flowcontrols.ifs;

import java.util.Scanner;

public class BirthStones {
    public static void main(String[] args) {
    int birthMonth;

    String stringBirthMonth;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What month's birthstone do you want to know?");
        stringBirthMonth = myScanner.nextLine();

        birthMonth = Integer.parseInt(stringBirthMonth);

        if (birthMonth == 1) {
            System.out.println("January's birthstone is Garnet.\n");
        } else if (birthMonth == 2) {
            System.out.println("February's birthstone is Amethyst.\n");
        } else if (birthMonth == 3) {
            System.out.println("March's birthstone is Aquamarine.\n");
        }  else if (birthMonth == 4) {
            System.out.println("April's birthstone is Diamond.\n");
        }  else if (birthMonth == 5) {
            System.out.println("May's birthstone is Emerald.\n");
        }  else if (birthMonth == 6) {
            System.out.println("June's birthstone is Pearl.\n");
        }  else if (birthMonth == 7) {
            System.out.println("July's birthstone is Ruby.\n");
        }  else if (birthMonth == 8) {
            System.out.println("August's birthstone is Peridot.\n");
        }  else if (birthMonth == 9) {
            System.out.println("September's birthstone is Sapphire.\n");
        } else if (birthMonth == 10) {
            System.out.println("October's birthstone is Opal.\n");
        } else if (birthMonth == 11) {
            System.out.println("November's birthstone is Topaz.\n");
        } else if (birthMonth == 12) {
            System.out.println("December's birthstone is Turquoise.\n");
        } else {
            System.out.println("I think you must be confused, " + birthMonth + " doesn't match a month.\n");
        }



    }
}
