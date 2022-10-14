import java.util.Random;
import java.util.Scanner;

public class LuckySevens {
    public static void main(String[] args) {

        int dollars;
        int winNumber = 7;

        String stringDollars;

        Random number = new Random();

        Scanner myScanner = new Scanner(System.in);

        System.out.println("How many dollars do you have to bet?");
        stringDollars = myScanner.nextLine();

        System.out.println("You have $" + stringDollars + " to bet");

        int num1 = number.nextInt(1, 10);
        int num2 = number.nextInt(1, 10);

        System.out.println("1st Random Number: " + num1);
        System.out.println("2nd Random Number: " + num2);

        if (num1 + num2 == winNumber) {
            System.out.println("Congratulations you win $4");
        } else System.out.println("To bad! you lose $1");

        if (nu)


    }
}

