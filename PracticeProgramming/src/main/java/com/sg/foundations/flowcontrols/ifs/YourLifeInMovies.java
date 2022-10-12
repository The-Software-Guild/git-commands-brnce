package com.sg.foundations.flowcontrols.ifs;

import java.util.Scanner;

public class YourLifeInMovies {
    public static void main(String[] args) {
        String name;
        int year;

        String stringYear;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Hey, let's play a game! What's your name? ");
        name = myScanner.nextLine();
        System.out.println("Ok, " + name + ", When were you born? ");
        stringYear = myScanner.nextLine();

        System.out.println("Well " + name + "...");
        year = Integer.parseInt(stringYear);

        if (year <= 2005) {
            System.out.println("Did you know that Pixar's 'Up' came out over a decade ago?");
        }
        if (year <= 1995) {
            System.out.println("And that the first Harry Potter came out over 15 years ago!");
        }
        if (year <= 1985) {
            System.out.println("Also, Space Jam came out not last decade, but the one before THAT");
        }
        if (year <= 1975) {
            System.out.println("The original Jurassic Park release is closer to the first lunar landing than it is to today.");
        }
        if (year <= 1965) {
            System.out.println("print out that the MASH TV series has been around for almost half a century!");
        }

    }
}
