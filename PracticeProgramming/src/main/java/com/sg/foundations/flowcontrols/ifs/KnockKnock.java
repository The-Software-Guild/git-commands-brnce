package com.sg.foundations.flowcontrols.ifs;

import java.util.Scanner;

public class KnockKnock {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine();

        // the .equals compares two strings
        // == compares values are equals to or not
        // if we do not type the capital letter the code executes the line
        //
        if(nameGuess.equals("Marty McFly")){
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future."); // Sorry, had to!
        }else{
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
    }
}
