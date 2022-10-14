package com.sg.foundations.scanner;

import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args) {

        String name, color, fruit;
        int number;
        int aliceNumber = -7;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Hello there! ");
        System.out.println("What's your name? ");
        name = inputReader.nextLine();

        System.out.println("");
        System.out.println("Hi, " + name + "! I'm Alice.");
        System.out.println("What is your favourite color? ");
        color = inputReader.nextLine();

        System.out.println("");
        System.out.println("Huh, " + color + "? Mine's Electric Lime.");

        System.out.println("");
        System.out.println("I really like limes. They're my favorite fruit, too.");
        System.out.println("What's YOUR favorite fruit, "  + name + "?");
        fruit = inputReader.nextLine();
        System.out.println("");

        System.out.println("Really? " + fruit + "? That's wild!");
        System.out.println("Speaking of favorites, what's your favorite number");
        number = Integer.parseInt(inputReader.nextLine());
        System.out.println("");


        System.out.println(number + " is a cool number. Mine's " + aliceNumber);
        System.out.println("Did you know " + number + " * " + aliceNumber + " is " +  (number * aliceNumber) + "? That's a cool number too!");
        System.out.println("");
        System.out.println("Well, thanks for talking to me, " + name + "!");

    }
}
