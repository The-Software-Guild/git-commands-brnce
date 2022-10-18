import java.util.Random;
import java.util.Scanner;

public class LuckySevens {
    public static void main(String[] args) {

        Random number = new Random();
        Scanner myScanner = new Scanner(System.in);
        int dollars;
        int count = 0;
        int dollarsPerLoop = 0;

        String stringDollars = "";


        System.out.println("How many dollars do you have to bet?");
        dollarsPerLoop = myScanner.nextInt();


        System.out.println("You have $" + stringDollars + " to bet");


        for (int i = 1; i <= 100; i++) {
            // Initialize variables with each loop
            dollars = dollarsPerLoop;
            while (dollars > 0) {
                count++;

                // Roll the dice.
                int num1 = number.nextInt(6) + 1;
                int num2 = number.nextInt(6) + 1;

                // Calculate the winnings or losses
                if (num1 + num2 == 7) {
                    // dollars += 4;
                    System.out.println("Congratulations you win $4");
                    System.out.println("You are broke after " + dollarsPerLoop + " rolls.\n");
                } else if (num1 + num2 != 7) {
                    System.out.println("To bad! you lose $1");
                }

            }

        }
    }
}


