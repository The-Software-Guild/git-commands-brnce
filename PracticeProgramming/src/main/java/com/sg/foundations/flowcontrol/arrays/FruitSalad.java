package com.sg.foundations.flowcontrol.arrays;

import java.util.Arrays;

public class FruitSalad {
    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad = new String[12];

        int apples = 0;
        int oranges = 0;

        // Code Recipe for fruit salad should go here!
        for (int i = 0; i < fruitSalad.length; i++) {
            do {
                if (fruit[i].contains("berry")) {
                    fruitSalad[i] = fruit[i];
                } else if (fruit[i].contains("Apple")) {
                    if (apples < 2) {
                        fruitSalad[i] = fruit[i];
                        apples += 1;
                    }
                } else if (fruit[i].contains("Orange")) {
                    if (oranges < 2) {
                        fruitSalad[i] = fruit[i];
                        oranges += 1;
                    }
                } else if (!fruit[i].contains("Tomato")) {
                    fruitSalad[i] = fruit[i];
                }
            } while (fruitSalad.length < 12);
        }
        System.out.println(Arrays.toString((fruitSalad)));
    }
}
