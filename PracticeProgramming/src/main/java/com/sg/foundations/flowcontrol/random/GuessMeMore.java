package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {
    public static void main(String[] args) {
        int guessNumber;

        String stringGuessNumber;
        Random number = new Random();

        int num = number.nextInt(-100, 100);

        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        System.out.println("Random chosen number: " + num);

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Can you guess my number? ");
        stringGuessNumber = myScanner.nextLine();

        guessNumber = Integer.parseInt(stringGuessNumber);

        System.out.println("Your guess: " + stringGuessNumber);


        if (guessNumber == num) {
            System.out.println("Wow, nice guess! That was it!");
        } else if (guessNumber < num) {
            System.out.println("Ha, nice try - too low! Try again!");
        } else if (guessNumber > num) {
            System.out.println("Too bad, way too high. Try again!");
        } else System.out.println("Can you guess my number? ");

    }
}

