package com.sg.foundations.flowcontrol.random;

import java.util.Random;

public class CoinFlipper {
    public static void main(String[] args) {

        Random randomizer = new Random();
        int tails = 1;
        int heads = 2;

        int range = heads - tails + 1;

        System.out.println("Ready, Set, Flip.....!!");

        // generate random numbers within 1 to 10
        for (int i = 0; i < heads; i++) {
            int rand = (int) (Math.random() * range) + tails;
            //System.out.println(rand);
        }

        if (range == heads) {
            System.out.println("You git TAILS!");
        } else if (range == tails) {
            System.out.println("You got HEADS!");
        }
    }
    }
