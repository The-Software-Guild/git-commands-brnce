package com.sg.foundations.flowcontrols.ifs;

import java.util.Scanner;

public class FieldDay {
    public static void main(String[] args) {

        String name;
        String person1 = "Vimes";

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What's your last name? ");
        name = myScanner.nextLine();

        System.out.println("compare " + name.compareTo(person1));

//        System.out.println("Aha! You're on the team 'Black Holes'!");
//        System.out.println("Good Luck in the games!");


    }
}
