package com.sg.foundations.flowcontrols.ifs;

import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {
        int choice;
        int age = 24;

        String stringChoice;

        System.out.println("I've chosen a number. Betcha can't guess it!");

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Can you guess my age?:");
        stringChoice = myScanner.nextLine();

        choice = Integer.parseInt(stringChoice);

        System.out.println("Your guess: " + stringChoice);


        if (choice == age) {
            System.out.println("Wow, nice guess! That was it!");
        }
        if (choice < age) {
            System.out.println("Ha, nice try - too low! I chose: " + age);
        }
        if (choice > age) {
            System.out.println("Too bad, way too high. I chose: " + age);
        }


    }
    }

