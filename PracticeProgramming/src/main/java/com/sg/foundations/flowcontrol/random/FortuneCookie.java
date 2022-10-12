package com.sg.foundations.flowcontrol.random;

import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args) {
        Random randomizer = new Random();

        int x = randomizer.nextInt(10);

        switch (x) {
            case 0:
                System.out.println("Your Geek Fortune: Learn as if you will live forever, live like you will die tomorrow.");
                break;
            case 1:
                System.out.println("Your Geek Fortune: I never dreamed about success. I worked for it.");
                break;
            case 2:
                System.out.println("Your Geek Fortune: Either you run the day or the day runs you.");
                break;
            case 3:
                System.out.println("Your Geek Fortune: Make each day your masterpiece.");
                break;
            case 4:
                System.out.println("Your Geek Fortune: Happiness often sneaks in through a door you didn’t know you left open.");
                break;
            case 5:
                System.out.println("Your Geek Fortune: Life changes very quickly, in a very positive way, if you let it.");
                break;
            case 6:
                System.out.println("Your Geek Fortune: Impossible is for the unwilling.");
                break;
            case 7:
                System.out.println("Your Geek Fortune: No pressure, no diamonds.");
                break;
            case 8:
                System.out.println("Your Geek Fortune: Believe you can and you’re halfway there.");
                break;
            case 9:
                System.out.println("Your Geek Fortune: When you have a dream, you’ve got to grab it and never let go.");
                break;
            case 10:
                System.out.println("Your Geek Fortune: You must be the change you wish to see in the world.");
                break;

        }
    }
}
