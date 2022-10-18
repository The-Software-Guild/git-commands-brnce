import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // initialising variables
        double investMoney, annualInterestRate, yearsOfInvesting;

        // Ask user how much they want to invest
        System.out.println("How much do you want to invest? ");

        investMoney = input.nextFloat();

        // Ask user how many years they want to invest
        System.out.println("How many years are you investing? ");

        annualInterestRate = input.nextFloat();

        // Ask user for their annual interest rate % growth
        System.out.println("What is the annual interest rate % growth? ");

        yearsOfInvesting = input.nextFloat();


        // finding the investment money at the beginning of the year
        // and the amount at the end of the year
        for (int i = 1; i <= yearsOfInvesting; i++) {

            // using the formula to get the new amount each quarter
            double amount =  (investMoney * Math.pow((1 + annualInterestRate / 400), 4 * 1));

            // print out the output
            System.out.println("Calculating...");
            System.out.println("Year " + i);
            System.out.println("Began with $" + investMoney);
            System.out.println("Earned $" + (amount - investMoney));
            System.out.println("Ended with $" + amount);
            System.out.println("");


            investMoney = amount;

        }

        input.close();

    }
}

