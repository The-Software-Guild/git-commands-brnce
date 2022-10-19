package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class ForTimesFor {

    public static void main(String[] args) {
        int userNum;
        int score = 0;
        int answer;

        Scanner sc = new Scanner(System.in);

        System.out.print("Which times table shall I recite? ");
        userNum = sc.nextInt();

        for (int i = 1; i < 16; i++) {
            System.out.println(i + " * " + userNum + " is: ");
            answer = sc.nextInt();

            if (answer == ( i * userNum)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Sorry no, the answer is: " + (i * userNum));
            }
        }

        System.out.println("You got " + score + " correct.");
        if(score < 8){
            System.out.println("Study more.");
        }
        if (score > 13) {
            System.out.println("Congrats!");
        }

    }
}