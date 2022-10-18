import java.util.Scanner;

public class Factorizer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int sum = 0;


        System.out.println("");
        System.out.println("The number you enter below will be factorized by the computer \n");

        // User inputs a number
        System.out.println("What number would you like to factor? ");
        int number = input.nextInt();
        System.out.println("The factors of " + number + " are:");

        //  Within the For loop, we used If Condition to check whether
        //  the Number % i is equal to zero or not. If the condition is True,
        //  then i will be printed as output
        int i;
        for (i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.format("%d ", i);

                // checks if the sum of the factors id
                // equal to the number entered by the user
                sum += i;

                // counts the total number of factors
                ++count;
            }
        }
        System.out.println("");
        System.out.println(number + " has " + count + " factors.");

        // check if the number is a perfect number or not
        if (sum == number) {
            System.out.println(number + " is a perfect number");
        } else
            System.out.println(number + " is not a perfect number.");

        // checks if the number is a prime number or not
        if (count > 1) {
            System.out.println(number + " is not a prime number.");
        } else
            System.out.println(number + " is a prime number.");
    }
}
