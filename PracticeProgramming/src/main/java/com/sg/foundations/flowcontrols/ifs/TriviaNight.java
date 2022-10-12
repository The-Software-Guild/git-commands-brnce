package com.sg.foundations.flowcontrols.ifs;

import java.util.Scanner;

public class TriviaNight {
    public static void main(String[] args) {
        String[] questions;
        int score = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("It's TRIVIA NIGHT! Are you ready?!\n");

        System.out.println("FIRST QUESTION!\n");

        questions = new String[3];
        questions[0] = "What is the Lowest Level Programming Language?";
        questions[1] = "Website Security CAPTCHA Forms Are Descended From the Work of?";
        questions[2] = "Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?";

        String first = questions[0];

        if(first == questions[0]){
            System.out.println(questions[0]);
            System.out.println("1) Source Code");
            System.out.println("2) Assembly Language");
            System.out.println("3) C#");
            System.out.println("4) Machine Code");
            System.out.println();
            System.out.print("YOUR ANSWER: ");
            String answer = input.next();

            switch (answer.toUpperCase()){
                case "4":
                    score++;
                    System.out.println("Correct!\n");
                    break;
                case "1":
                case "2":
                case "3":
                    System.out.println("Incorrect!\n");
                    break;
                default:
                    System.out.println("Incorrect input\n");
                    break;
            }
        }

        String second = questions[1];

        System.out.println("SECOND QUESTION!");

        if(second == questions[1]) {
            System.out.println(questions[1]);
            System.out.println("1) Grace Hopper");
            System.out.println("2) Alan Turing");
            System.out.println("3) Charles Babbage");
            System.out.println("4) Larry Page");
            System.out.println();
            System.out.print("YOUR ANSWER: ");
            String answer = input.next();

            switch (answer.toUpperCase()) {
                case "2":
                    score++;
                    System.out.println("Correct!\n");
                    break;
                case "1":
                case "3":
                case "4":
                    System.out.println("Incorrect!\n");
                    break;
                default:
                    System.out.println("Incorrect input\n");
                    break;
            }
        }

        String third = questions[2];

        System.out.println("LAST QUESTION!");

        if(third == questions[2]) {
            System.out.println(questions[2]);
            System.out.println("1) Serenity");
            System.out.println("2) The Battlestar Galactica");
            System.out.println("3) The USS Enterprise");
            System.out.println("4) The Millennium Falcon");
            System.out.println();
            System.out.print("YOUR ANSWER: ");
            String answer = input.next();

            switch (answer.toUpperCase()) {
                case "3":
                    score++;
                    System.out.println("Correct!\n");
                    break;
                case "1":
                case "2":
                case "4":
                    System.out.println("Incorrect!\n");
                    break;
                default:
                    System.out.println("Incorrect input\n");
                    break;
            }
        }
        if (score == 3) {
            System.out.println("AWESOME - you got 3 correct!\n");
        } else if (score == 2) {
            System.out.println("Nice job - you got 2 correct!\n");
        } else if (score == 1) {
            System.out.println("You could do better - you got 1 correct!\n");
        } else if (score == 0) {
            System.out.println("Try again! - you got 0 correct!\n");
        } else {
            System.out.println("Retake Quiz\n");
        }


    }
}
