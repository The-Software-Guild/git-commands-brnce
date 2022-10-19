package com.sg.foundations.flowcontrol.arrays;

public class FruitsBasket {
    public static void main(String[] args) {
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
                "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
                "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
                "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
                "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
                "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
                "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
                "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
                "Dragonfruit", "Apple", "Orange", "Orange"};

        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;
        int count = 0;

        // counts the total number of fruits in the array
        for (String i: fruitBasket) {
            count++;

            // counts the number of specified fruits in the array list
           if (i.equals("Orange")) {
                numOranges++;
            }
            if (i.equals("Apple")) {
                numApples++;
            }
            if (i.equals("Kiwi")) {
                numOtherFruit++;
            } else if (i.equals("Banana")){
                numOtherFruit++;
            } else if (i.equals("Dragonfruit")){
                numOtherFruit++;
            } else if (i.equals("PawPaw")){
                numOtherFruit++;
            }
        }

        // prints the results
        System.out.println("Total number of Fruit in Basket: " + count);
        System.out.println("Number of Apples: " + numApples);
        System.out.println("Number of Oranges: " + numOranges);
        System.out.println("Number of Other Fruit: " + numOtherFruit);



    }
}
