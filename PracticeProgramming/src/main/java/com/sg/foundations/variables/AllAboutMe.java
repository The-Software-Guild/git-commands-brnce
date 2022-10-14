package com.sg.foundations.variables;

import java.util.Scanner;

public class AllAboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        String food;
        int num_pets;
        String accomodation;
        boolean canWhistle;

        System.out.println("What is your name? ");
        name = scanner.nextLine();
        System.out.println("What is your favourite food? ");
        food = scanner.nextLine();
        System.out.println("How many pets do you have? ");
        num_pets = Integer.parseInt(scanner.nextLine());
        System.out.println("Where do you live? ");
        accomodation = scanner.nextLine();
        System.out.println("Can you Whistle? True or False");
        canWhistle = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("My name is " + name + "." );
        System.out.println("My favourite food is " + food + "." );
        System.out.println("I have " + num_pets + " pets." );
        System.out.println("I live in " + accomodation + "." );
        System.out.println("It is " + canWhistle + " I know how to whistle." );
    }
}
